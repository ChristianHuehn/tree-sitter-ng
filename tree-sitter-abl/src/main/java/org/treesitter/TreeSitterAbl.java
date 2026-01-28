package org.treesitter;

import org.treesitter.TSLanguage;
import org.treesitter.utils.NativeUtils;

public class TreeSitterAbl extends TSLanguage {

    static {
        NativeUtils.loadLib("lib/tree-sitter-abl");
    }
    private native static long tree_sitter_abl();

    public TreeSitterAbl() {
        super(tree_sitter_abl());
    }

    private TreeSitterAbl(long ptr) {
        super(ptr);
    }

    @Override
    public TSLanguage copy() {
        return new TreeSitterAbl(copyPtr());
    }
}
