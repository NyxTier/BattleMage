import ;

public void start(Stage stagePrimary) {
    VBox rootPrimary = new VBox();
    Scene scenePrimary = new Scene(rootPrimary);

    stagePrimary.setScene(scenePrimary);
    stagePrimary.show();
};

public static void main(String [] args) {
    launch();
}