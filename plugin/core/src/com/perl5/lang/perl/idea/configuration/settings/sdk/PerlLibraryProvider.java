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

package com.perl5.lang.perl.idea.configuration.settings.sdk;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.AdditionalLibraryRootsProvider;
import com.intellij.openapi.roots.SyntheticLibrary;
import com.intellij.openapi.vfs.VirtualFile;
import com.perl5.lang.perl.idea.project.PerlProjectManager;
import com.perl5.lang.perl.util.PerlRunUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PerlLibraryProvider extends AdditionalLibraryRootsProvider {

  @Override
  public @NotNull Collection<SyntheticLibrary> getAdditionalProjectLibraries(@NotNull Project project) {
    return PerlProjectManager.getInstance(project).getProjectLibraries();
  }

  @Override
  public @NotNull Collection<VirtualFile> getRootsToWatch(@NotNull Project project) {
    List<VirtualFile> libraryRoots = PerlProjectManager.getInstance(project).getAllLibraryRoots();
    Sdk sdk = PerlProjectManager.getSdk(project);
    if (sdk != null) {
      ArrayList<VirtualFile> libraryAndBinaryRoots = new ArrayList<>(libraryRoots);
      PerlRunUtil.getBinDirectories(sdk).forEach(libraryAndBinaryRoots::add);
      return libraryAndBinaryRoots;
    }
    return libraryRoots;
  }
}
