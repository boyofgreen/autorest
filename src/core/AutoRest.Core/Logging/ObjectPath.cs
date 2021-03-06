﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Linq;
using YamlDotNet.RepresentationModel;

namespace AutoRest.Core.Logging
{
    /// <summary>
    /// Represents a path into an object.
    /// </summary>
    public class ObjectPath
    {
        public static ObjectPath Empty => new ObjectPath(Enumerable.Empty<ObjectPathPart>());

        private ObjectPath(IEnumerable<ObjectPathPart> path)
        {
            Path = path;
        }

        private ObjectPath Append(ObjectPathPart part) => new ObjectPath(Path.Concat(new[] { part }));

        public ObjectPath AppendIndex(int index) => Append(new ObjectPathPartIndex(index));

        public ObjectPath AppendProperty(string property) => Append(new ObjectPathPartProperty(property));

        public IEnumerable<ObjectPathPart> Path { get; }
        
        public string XPath => "#" + string.Concat(Path.Select(p => p.XPath));

        public YamlNode SelectNode(YamlNode node)
        {
            YamlNode result = node;
            foreach (var part in Path)
            {
                result = part.SelectNode(ref node) ?? result;
            }
            return result;
        }
    }
}
