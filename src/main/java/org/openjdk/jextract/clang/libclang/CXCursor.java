// Generated by jextract

package org.openjdk.jextract.clang.libclang;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * {@snippet lang=c :
 * struct {
 *     enum CXCursorKind kind;
 *     int xdata;
 *     void* data[3];
 * };
 * }
 */
public class CXCursor {

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Index_h.C_INT.withName("kind"),
        Index_h.C_INT.withName("xdata"),
        MemoryLayout.sequenceLayout(3, Index_h.C_POINTER).withName("data")
    ).withName("$anon$2706:9");

    public static final GroupLayout $LAYOUT() {
        return $LAYOUT;
    }
    private static final long kind$OFFSET = 0;
    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum CXCursorKind kind;
     * }
     */
    public static int kind$get(MemorySegment seg) {
        return seg.get(Index_h.C_INT, kind$OFFSET);
    }
    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum CXCursorKind kind;
     * }
     */
    public static void kind$set(MemorySegment seg, int x) {
        seg.set(Index_h.C_INT, kind$OFFSET, x);
    }
    public static int kind$get(MemorySegment seg, long index) {
        return seg.get(Index_h.C_INT, kind$OFFSET + (index * sizeof()));
    }
    public static void kind$set(MemorySegment seg, long index, int x) {
        seg.set(Index_h.C_INT, kind$OFFSET + (index * sizeof()), x);
    }
    private static final long xdata$OFFSET = 4;
    /**
     * Getter for field:
     * {@snippet lang=c :
     * int xdata;
     * }
     */
    public static int xdata$get(MemorySegment seg) {
        return seg.get(Index_h.C_INT, xdata$OFFSET);
    }
    /**
     * Setter for field:
     * {@snippet lang=c :
     * int xdata;
     * }
     */
    public static void xdata$set(MemorySegment seg, int x) {
        seg.set(Index_h.C_INT, xdata$OFFSET, x);
    }
    public static int xdata$get(MemorySegment seg, long index) {
        return seg.get(Index_h.C_INT, xdata$OFFSET + (index * sizeof()));
    }
    public static void xdata$set(MemorySegment seg, long index, int x) {
        seg.set(Index_h.C_INT, xdata$OFFSET + (index * sizeof()), x);
    }
    private static final long data$OFFSET = 8;
    private static final long data$SIZE = 24;
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(data$OFFSET, data$SIZE);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) {
        return addr.reinterpret($LAYOUT().byteSize(), scope, null);
    }
}