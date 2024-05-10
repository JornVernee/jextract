/*
 * Copyright (c) 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

import org.testng.annotations.Test;
import test.jextract.bitfields.*;
import java.lang.foreign.*;

import static org.testng.Assert.assertEquals;
import static test.jextract.bitfields.bitfields_h.*;

/*
 * @test
 * @library /lib
 * @build testlib.TestUtils
 * @run main/othervm JtregJextract -l Bitfields --use-system-load-library -t test.jextract.bitfields bitfields.h
 * @build TestBitFields
 * @run testng/othervm --enable-native-access=ALL-UNNAMED TestBitFields
 */
public class TestBitFields {
    @Test
    public void testBitFields() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment bitFields = BitFields.allocate(arena);

            BitFields.x(bitFields, 42);
            BitFields.foo(bitFields, (byte) 1);
            BitFields.bar(bitFields, (byte) 2);
            BitFields.baz(bitFields, 16);

            assertEquals(BitFields.x(bitFields), 42);
            assertEquals(BitFields.foo(bitFields), (byte) 1);
            assertEquals(BitFields.bar(bitFields), (byte) 2);
            assertEquals(BitFields.baz(bitFields), 16);

            assertEquals(get_x(bitFields), 42);
            assertEquals(get_foo(bitFields), 1);
            assertEquals(get_bar(bitFields), 2);
            assertEquals(get_baz(bitFields), 16);
        }
    }
}
