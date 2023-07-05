package Seminar3;

import java.io.FileWriter;
import java.io.IOException;



public class UserDataApplication {

    public static void main(String[] args) {
        try {
            String userData = getUserDataFromInput(args);
            String[] userDataArray = userData.split(" ");

            if (userDataArray.length != 4) {
                throw new IllegalArgumentException("Неверное количество данных!");
            }

            String lastName = userDataArray[0];
            String firstName = userDataArray[1];
            String patronymic = userDataArray[2];
            long phoneNumber = parsePhoneNumber(userDataArray[3]);

            saveUserDataToFile(lastName, firstName, patronymic, phoneNumber);
            System.out.println("Данные успешно сохранены.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getUserDataFromInput(String[] inputArgs) {
        if (inputArgs.length == 0) {
            throw new IllegalArgumentException("Введите данные в формате: Фамилия Имя Отчество НомерТелефона");
        }

        return String.join(" ", inputArgs);
    }

    private static long parsePhoneNumber(String phoneNumberStr) {
        try {
            return Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат номера телефона!");
        }
    }

    private static void saveUserDataToFile(String lastName, String firstName, String patronymic, long phoneNumber) throws IOException {
            String dataLine ="Фамилия" + lastName + " " + "Имя" + firstName + " " + "Отчество" +  patronymic + " " + "Номер телефона" + phoneNumber;
            String fileName = lastName + ".txt";

            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(fileName, true);
                fileWriter.write(dataLine + System.lineSeparator());
            } finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
        }
    }
