/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.ext.git.client.action;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.eclipse.che.ide.api.action.ActionEvent;
import org.eclipse.che.ide.api.app.AppContext;
import org.eclipse.che.ide.ext.git.client.GitLocalizationConstant;
import org.eclipse.che.ide.ext.git.client.remove.RemoveFromIndexPresenter;
import org.eclipse.che.ide.part.explorer.project.ProjectExplorerPresenter;
import org.eclipse.che.ide.ui.FontAwesome;

/** @author Andrey Plotnikov */
@Singleton
public class RemoveFromIndexAction extends GitAction {
    private final RemoveFromIndexPresenter presenter;

    @Inject
    public RemoveFromIndexAction(RemoveFromIndexPresenter presenter,
                                 AppContext appContext,
                                 GitLocalizationConstant constant,
                                 ProjectExplorerPresenter projectExplorer) {
        super(constant.removeFromIndexTitle(), constant.removeFromIndexTitle(), FontAwesome.MINUS, appContext, projectExplorer);
        this.presenter = presenter;
    }

    /** {@inheritDoc} */
    @Override
    public void actionPerformed(ActionEvent e) {
        presenter.showDialog();
    }
}
