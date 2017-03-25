package ru.nsn.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Font;
import ru.nsn.model.Person;

public class PersonOverviewController {

    @FXML
    private TableView<Person> tableid;
    @FXML
    private TableColumn<Person, String> nameid;
    @FXML
    private TableColumn<Person, String> famId;
    @FXML
    private TableColumn<Person, Integer> ageid;

    @FXML
    private Label labelname;
    @FXML
    private Label lebelfam;
    @FXML
    private Label labelstrit;
    @FXML
    private Label labelcyti;
    @FXML
    private Label labelbld;
    @FXML
    private Label labelage;

    private MainApp mainApp;

    public PersonOverviewController() {
    }

    @FXML
    private void initialize() {
        // Инициализация таблицы адресатов с двумя столбцами.
        nameid.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        famId.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        ageid.setCellValueFactory(cellData -> cellData.getValue().ageProperty().asObject());
        showPersonDetails(null);
        tableid.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> showPersonDetails(newValue));

    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Добавление в таблицу данных из наблюдаемого списка
        tableid.setItems(mainApp.getPersonData());
    }

    @FXML
    private void handleDeletePerson() {
        int selectedIndex = tableid.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            tableid.getItems().remove(selectedIndex);
        } else {
            // Ничего не выбрано.
            Alert alert = new Alert(AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Person Selected");
            alert.setContentText("Please select a person in the table.");

            alert.showAndWait();
        }
    }

    private void showPersonDetails(Person person) {
        if (person != null) {
            // Заполняем метки информацией из объекта person.
            //labelname.setText(person.getFirstName());
            labelname.setText(person.getFirstName());
            labelname.fontProperty().set(Font.font("Verdana"));//setFont("Verdana");
            lebelfam.setText(person.getLastName());
            labelstrit.setText(person.getStreet());
            labelbld.setText(Integer.toString(person.getPostalCode()));
            labelcyti.setText(person.getCity());

            // TODO: Нам нужен способ для перевода дня рождения в тип String!
            // birthdayLabel.setText(...);
        } else {
            // Если Person = null, то убираем весь текст.
            labelname.setText("");
            lebelfam.setText("");
            labelstrit.setText("eertert");
            labelbld.setText("");
            labelcyti.setText("");
            labelage.setText("");
        }
    }

    /**
     * Вызывается, когда пользователь кликает по кнопке New... Открывает
     * диалоговое окно с дополнительной информацией нового адресата.
     */
    @FXML
    private void handleNewPerson() {
        Person tempPerson = new Person();
        boolean okClicked = mainApp.showPersonEditDialog(tempPerson);
        if (okClicked) {
            mainApp.getPersonData().add(tempPerson);
        }
    }

    /**
     * Вызывается, когда пользователь кликает по кнопка Edit... Открывает
     * диалоговое окно для изменения выбранного адресата.
     */
    @FXML
    private void handleEditPerson() {
        Person selectedPerson = tableid.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
            if (okClicked) {
                showPersonDetails(selectedPerson);
            }

        } else {
            // Ничего не выбрано.
            Alert alert = new Alert(AlertType.WARNING);
            alert.initOwner(mainApp.getPrimaryStage());
            alert.setTitle("No Selection");
            alert.setHeaderText("No Person Selected");
            alert.setContentText("Please select a person in the table.");

            alert.showAndWait();
        }
    }

}
