package ru.nsn.view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import ru.nsn.controller.SiteTableController;
import ru.nsn.interfaces.SiteFactory;
import ru.nsn.model.MapSiteFactory;
import ru.nsn.model.Person;
import ru.nsn.model.SitesDataBaseModel;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainApp extends Application {
    private Stage primaryStage;

    private BorderPane rootLayout;
    private AnchorPane siteTable;
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    private SiteFactory siteFactory = new MapSiteFactory();

    public MainApp() {
        personData.add(new Person("Hans", "Muster"));
        personData.add(new Person("Ruth", "Mueller"));
        personData.add(new Person("Heinz", "Kurz"));
        personData.add(new Person("Cornelia", "Meier"));
        personData.add(new Person("Werner", "Meyer"));
        personData.add(new Person("Lydia", "Kunz"));
        personData.add(new Person("Anna", "Best"));
        personData.add(new Person("Stefan", "Meier"));
        personData.add(new Person("Martin", "Mueller"));
        personData.add(new Person("Борис", "Першин"));

    }

    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(800);
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("NSN приложение");

        initRootLayout();
        //showSiteTable();
        //showPersonOverview();

    }

    private void testSitesGenerator() {
        for (int i = 0; i < 100; i++) {
            // siteFactory=new MapSiteFactory();
            //         siteFactory.setSite(new Site(i, i));
        }
    }

    public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
  /*          FXMLLoader loader = new FXMLLoader();
            ResourceBundle bundle = ResourceBundle.getBundle("ru/nsn/view/MainFormBundle",new Locale("ru","RU"));
            loader.setResources(bundle);
            loader.setLocation(MainApp.class.getResource("../view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();*/
            FXMLLoader loader = new FXMLLoader();
            ResourceBundle bundle = ResourceBundle.getBundle("ru/nsn/bundle/MainFormBundle", new Locale("ru"));
            loader.setResources(bundle);
            loader.setLocation(MainApp.class.getResource("/ru/nsn/fxml/SiteTable.fxml"));

            siteTable = (AnchorPane) loader.load();
            // Отображаем сцену, содержащую корневой макет.
            //Scene scene = new Scene(rootLayout,800,600);
            Scene scene = new Scene(siteTable, 800, 600);
            SiteTableController siteTableController = loader.getController();
            SitesDataBaseModel sitesDataBaseModel = new SitesDataBaseModel();
            siteTableController.initSiteDataBaseModel(sitesDataBaseModel);
            //scene.getStylesheets().add("../view/Nsn.css");//.styleProperty().setValue(
            //scene.getRoot().css
            primaryStage.setScene(scene);

            //primaryStage.s
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showSiteTable() {
        try {
            // Загружаем сведения об адресатах.

            FXMLLoader loader = new FXMLLoader();
            ResourceBundle bundle = ResourceBundle.getBundle("ru/nsn/bundle/MainFormBundle", new Locale("ru"));
            loader.setResources(bundle);
            loader.setLocation(MainApp.class.getResource("ru/nsn/fxml/SiteTable.fxml"));

            siteTable = (AnchorPane) loader.load();

            // Помещаем сведения об адресатах в центр корневого макета.
            rootLayout.setCenter(siteTable);
            //rootLayout.setBottom(personOverview);
            SiteTableController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPersonOverview() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("ru/nsn/fxml/SiteOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Помещаем сведения об адресатах в центр корневого макета.
            rootLayout.setCenter(personOverview);
            //rootLayout.setBottom(personOverview);
            PersonOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public boolean showPersonEditDialog(Person person) {
        try {
            // Загружаем fxml-файл и создаём новую сцену
            // для всплывающего диалогового окна.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("ru/nsn/fxml/dialogEdit.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Создаём диалоговое окно Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Person");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Передаём адресата в контроллер.
            PersonEditDialogController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(person);

            // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
