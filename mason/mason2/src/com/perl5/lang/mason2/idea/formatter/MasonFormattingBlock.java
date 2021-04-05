/*
 * Copyright 2015-2020 Alexandr Evstigneev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.perl5.lang.mason2.idea.formatter;

import com.intellij.lang.ASTNode;
import com.perl5.lang.perl.idea.formatter.PerlFormattingContext;
import com.perl5.lang.perl.idea.formatter.blocks.PerlFormattingBlock;
import org.jetbrains.annotations.NotNull;


public class MasonFormattingBlock extends PerlFormattingBlock {
  public MasonFormattingBlock(@NotNull ASTNode node, @NotNull PerlFormattingContext context
  ) {
    super(node, context);
  }


  @Override
  protected PerlFormattingBlock createBlock(@NotNull ASTNode node) {
    return new MasonFormattingBlock(node, myContext);
  }
}