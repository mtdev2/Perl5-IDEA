// This is a generated file. Not intended for manual editing.
package com.perl5.lang.perl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.perl5.lang.perl.lexer.PerlElementTypesGenerated.*;
import com.perl5.lang.perl.psi.mixins.PerlStringMixin;
import com.perl5.lang.perl.psi.*;

public class PsiPerlStringDqImpl extends PerlStringMixin implements PsiPerlStringDq {

  public PsiPerlStringDqImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiPerlVisitor visitor) {
    visitor.visitStringDq(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PsiPerlVisitor) accept((PsiPerlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PsiPerlDerefExpr> getDerefExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PsiPerlDerefExpr.class);
  }

}
