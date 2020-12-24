package gmiBank_team22.utilities;

import gmiBank_team22.pojos.Applicants;
import gmiBank_team22.pojos.Country;
import gmiBank_team22.pojos.Customer;
import gmiBank_team22.pojos.States;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {
    public static void saveDataInFile(String fileName, Customer[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length; i++)
                writer.append(customers[i].getSsn() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileWithSSN(String fileName, Customer customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customer.getSsn());
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileWithUserInfo(String fileName, Customer customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(customer.getUser().getFirstName());
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileWithAllCustomerInfo(String fileName, Customer[] customers) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < customers.length; i++) {
                writer.append(customers[i].getFirstName() + " , " + customers[i].getLastName() + "\n");
                if (customers[i].getUser() != null)
                    writer.append(customers[i].getUser().getFirstName());
                if (customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName());
            }
            writer.close();
        } catch (Exception e) {
        }
    }


    public static void saveAllStates(String fileName, States[] states) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < states.length; i++)
                writer.append(states[i].getName() + "," + states[i].getId() + "\n");

            writer.close();
        } catch (Exception e) {

        }


    }

    public static void saveAllApplicants(String fileName, Applicants[] applicants) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < applicants.length; i++)
                writer.append(applicants[i].getId() + "," + applicants[i].getSsn() + "," + applicants[i].getFirstName() + "," + applicants[i].
                        getLastName() + "," + applicants[i].getAddress() + "," + applicants[i].getMobilePhoneNumber() + "," +
                        applicants[i].getUserId() + "," + applicants[i].getUserName() + "," + applicants[i].getEmail() + "," +
                        applicants[i].getCreateDate() + "\n");

            writer.close();
        } catch (Exception e) {

        }

    }

    public static void saveDataInFileInt(String fileName, Country[] country) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < country.length; i++)
                writer.append(country[i].getId() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFile(String fileName, Country[] country) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < country.length; i++)
                writer.append(country[i].getName() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




        public static void saveDataInFileFirstNameLastName (String fileName, Customer[]customers){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                for (int i = 0; i < customers.length; i++)
                    writer.append(customers[i].getFirstName() + " , " + customers[i].getLastName() + "\n");

                writer.close();
            } catch (Exception e) {
            }
        }


    }

