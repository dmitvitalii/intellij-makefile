// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import name.kropp.intellij.makefile.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MakefileVariableAssignmentImpl extends ASTWrapperPsiElement implements MakefileVariableAssignment {

  public MakefileVariableAssignmentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MakefileVisitor visitor) {
    visitor.visitVariableAssignment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MakefileVisitor) accept((MakefileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MakefileFunction getFunction() {
    return PsiTreeUtil.getChildOfType(this, MakefileFunction.class);
  }

  @Override
  @NotNull
  public MakefileVariable getVariable() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, MakefileVariable.class));
  }

  @Override
  @Nullable
  public MakefileVariableValue getVariableValue() {
    return PsiTreeUtil.getChildOfType(this, MakefileVariableValue.class);
  }

  @Nullable
  public PsiElement getAssignment() {
    return MakefilePsiImplUtil.getAssignment(this);
  }

  @Nullable
  public String getValue() {
    return MakefilePsiImplUtil.getValue(this);
  }

}
