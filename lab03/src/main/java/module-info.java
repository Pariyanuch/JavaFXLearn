module ku.cs.lab03 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ku.cs.lab03 to javafx.fxml;
    exports ku.cs.lab03;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}