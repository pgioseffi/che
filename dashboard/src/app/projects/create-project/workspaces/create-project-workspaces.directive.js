/*
 * Copyright (c) 2015-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 */
'use strict';

/**
 * Defines a directive for displaying select workspace widget.
 * @author Oleksii Orel
 */
export class CreateProjectWorkspaces {

  /**
   * Default constructor that is using resource
   * @ngInject for Dependency injection
   */
  constructor() {
    this.restrict = 'E';
    this.templateUrl = 'app/projects/create-project/workspaces/create-project-workspaces.html';
    this.bindToController = true;
    this.controller = 'CreateProjectWorkspacesController';
    this.controllerAs = 'createProjectWorkspacesController';

    // scope values
    this.scope = {
      workspace: '=cheWorkspace',
      onWorkspaceChange: '&cheWorkspaceChange'
    };

  }

}
