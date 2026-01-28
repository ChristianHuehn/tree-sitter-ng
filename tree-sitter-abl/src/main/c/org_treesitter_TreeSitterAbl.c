
#include <jni.h>
void *tree_sitter_abl();
/*
 * Class:     org_treesitter_TreeSitterAbl
 * Method:    tree_sitter_abl
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_treesitter_TreeSitterAbl_tree_1sitter_1abl
  (JNIEnv *env, jclass clz){
   return (jlong) tree_sitter_abl();
}
