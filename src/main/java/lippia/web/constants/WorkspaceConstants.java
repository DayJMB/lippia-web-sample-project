package lippia.web.constants;

public class WorkspaceConstants {

        public static final String DROPDOWN_OPTIONS  = "xpath://a[@class='cl-d-flex cl-dropdown-toggle cl-no-arrow cl-hover-pointer']";
        public static final String MANAGE_WORKSPACES = "xpath://a[contains(.,' Manage workspaces ')]";
        public static final String CREATE_NEW_WORKSPACE_BUTTON = "xpath://button[@type='button'][@class='cl-btn cl-btn-outline-primary cl-d-none-print']";
        public static final String CREATE_NEW_WORKSPACE_MODAL = "xpath://div[@class='cl-modal-header ng-star-inserted'][contains(.,'Create new workspace')]";
        public static final String INPUT_WORKSPACE_NAME = "xpath://input[@type='text'][@formcontrolname='name']";
        public static final String CREATE_BUTTON = "xpath://button[@type='submit'][contains(text(),'Create')]";
        public static final String MESSAGE_INPUT_WORKSPACE_NAME = "xpath://create-workspace-modal[contains(.,' Workspace name has to be between 1 and 50 characters long ')]";
        public static final String WORKSPACE = "xpath://span[contains(text(),'Lippia web3')]";
    }