import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.*;

public class Gui {

    //FarmBank farmbank;


    JFrame frame; // Main Frame
    ArrayList<Product> products;
    ArrayList<Location> locations;
    Font font = new Font("Courier", Font.BOLD, 25);
    Font font2 = new Font("Courier", Font.BOLD, 35);
    JPanel farmerregpanel;
    JButton ProdButton;
    JPanel welcomePanel = WelcomePanel();
    JPanel userEnterPanel = UserEnterPanel();
    JPanel farmerEnterPanel = FarmerEnterPanel();
    JPanel customerEnterPanel = CustomerEnterPanel();
    JPanel signInPanel = SignInPanel();
    JPanel farmerSignInPanel = FarmerSignInPanel();
    JPanel customerSignInPanel = CustomerSignInPanel();
    JPanel farmerAccountPanel = FarmerAccountPanel();
    JPanel customerAccountPanel = CustomerAccountPanel();
    JPanel myFarmerWalletPanel = MyFarmerWalletPanel();
    JPanel myCustomerWalletPanel = MyCustomerWalletPanel();
    JPanel farmerManageAccountPanel = ManageFarmerAccountPanel();
    JPanel customerManageAccountPanel = ManageCustomerAccountPanel();
    JPanel addProductPanel = AddProductPanel();
    JPanel myProductsPanel = MyProductsPanel();
    JPanel soldProductsPanel = SoldProductsPanel();
    JPanel farmerDepositPanel = FarmerDepositPanel();
    JPanel farmerWithdrawPanel = FarmerWithdrawPanel();
    JPanel farmerAcccountActivitiesPanel = FarmerAcccountActivitiesPanel();
    JPanel customerAccountActivitiesPanel = CustomerAccountActivitiesPanel();
    JPanel customerWithdrawPanel = CustomerWithdrawPanel();
    JPanel customerDepositPanel = CustomerDepositPanel();
    JPanel myOrdersPanel = MyOrdersPanel();
    JPanel buyProductPanel = BuyProductPanel();
//	JPanel showinfoPanel = CreateShowInfoPanel();
//	JPanel consregpanel = CreateConsRegPanel();
//	JPanel farmerregistrationpanel = CreateFarmerRegPanel();

    public Gui() {
        //this.farmbank = farmbank;

        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 1));
        this.frame = frame;

        frame.add(welcomePanel);
        frame.setVisible(true);

    }

    public JPanel WelcomePanel() {
        JPanel welcomePanel = new JPanel();
        welcomePanel.setSize(1000, 1000);
        welcomePanel.setLayout(null);

        JLabel label = new JLabel();
        label.setText("Welcome To Farmbank");
        label.setForeground(Color.RED);
        label.setFont(font);
        label.setBounds(450, 150, 500, 50);
        welcomePanel.add(label);

        JButton enterButton = new JButton();
        enterButton.setText("LOG IN");
        enterButton.setForeground(Color.RED);
        enterButton.setFont(font);
        enterButton.setBounds(400, 300, 300, 100);
        welcomePanel.add(enterButton);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(welcomePanel);
                frame.add(userEnterPanel);
                frame.validate();
                frame.repaint();
            }
        });

        JButton registerButton = new JButton();
        registerButton.setText("SIGN UP");
        registerButton.setForeground(Color.RED);
        registerButton.setFont(font);
        registerButton.setBounds(400, 450, 300, 100);
        welcomePanel.add(registerButton);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(welcomePanel);
                frame.add(signInPanel);
                frame.validate();
                frame.repaint();
            }
        });
        return welcomePanel;
    }

    public JPanel UserEnterPanel() {

        JPanel userEnterPanel = new JPanel();
        userEnterPanel.setSize(1000, 1000);
        userEnterPanel.setLayout(null);

        JLabel label = new JLabel();
        label.setText("Welcome To Farmbank");
        label.setForeground(Color.RED);
        label.setFont(font);
        label.setBounds(450, 150, 500, 50);
        userEnterPanel.add(label);

        JButton farmerButton = new JButton();
        farmerButton.setText("Entering as a Farmer");
        farmerButton.setForeground(Color.RED);
        farmerButton.setFont(font);
        farmerButton.setBounds(400, 300, 350, 100);
        userEnterPanel.add(farmerButton);
        farmerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(userEnterPanel);
                frame.add(farmerEnterPanel);
                frame.validate();
                frame.repaint();
            }
        });

        JButton customerButton = new JButton();
        customerButton.setText("Entering as a Customer");
        customerButton.setForeground(Color.RED);
        customerButton.setFont(font);
        customerButton.setBounds(400, 450, 350, 100);
        userEnterPanel.add(customerButton);
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(userEnterPanel);
                frame.add(customerEnterPanel);
                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(userEnterPanel);
            frame.add(welcomePanel);
            frame.revalidate();
            frame.repaint();
        });
        userEnterPanel.add(prevButton);

        return userEnterPanel;
    }

    public JPanel FarmerEnterPanel() {
        JPanel farmerEnterPanel = new JPanel();
        farmerEnterPanel.setSize(1000, 1000);
        farmerEnterPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 300, 500, 50);
        farmerEnterPanel.add(label2);

        JLabel label = new JLabel();
        label.setText("You Can Enter With Your Username And Password");
        label.setForeground(Color.RED);
        label.setFont(font);
        label.setBounds(250, 400, 800, 50);
        farmerEnterPanel.add(label);

        JLabel userlabel = new JLabel("Username :");
        userlabel.setBounds(350, 500, 300, 25);
        farmerEnterPanel.add(userlabel);

        JLabel pwlabel = new JLabel("Password :");
        pwlabel.setBounds(350, 550, 300, 20);
        farmerEnterPanel.add(pwlabel);

        JTextField userfield = new JTextField();
        userfield.setBounds(450, 500, 200, 25);
        farmerEnterPanel.add(userfield);

        JTextField pwfield = new JTextField();
        pwfield.setBounds(450, 550, 200, 25);
        farmerEnterPanel.add(pwfield);

        JButton enterButton = new JButton();
        enterButton.setText("Log In");
        enterButton.setForeground(Color.RED);
        enterButton.setFont(font);
        enterButton.setBounds(450, 650, 200, 100);
        farmerEnterPanel.add(enterButton);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(farmerEnterPanel);
                frame.add(farmerAccountPanel);

                //database den çekilecek

                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(farmerEnterPanel);
            frame.add(userEnterPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerEnterPanel.add(prevButton);
        return farmerEnterPanel;
    }

    public JPanel CustomerEnterPanel() {
        JPanel customerEnterPanel = new JPanel();
        customerEnterPanel.setSize(1000, 1000);
        customerEnterPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 300, 500, 50);
        customerEnterPanel.add(label2);

        JLabel label = new JLabel();
        label.setText("You Can Enter With Your Username And Password");
        label.setForeground(Color.RED);
        label.setFont(font);
        label.setBounds(250, 400, 800, 50);
        customerEnterPanel.add(label);

        JLabel userlabel = new JLabel("Username :");
        userlabel.setBounds(350, 500, 300, 25);
        customerEnterPanel.add(userlabel);

        JLabel pwlabel = new JLabel("Password :");
        pwlabel.setBounds(350, 550, 300, 20);
        customerEnterPanel.add(pwlabel);

        JTextField userfield = new JTextField();
        userfield.setBounds(450, 500, 200, 25);
        customerEnterPanel.add(userfield);

        JTextField pwfield = new JTextField();
        pwfield.setBounds(450, 550, 200, 25);
        customerEnterPanel.add(pwfield);

        JButton enterButton = new JButton();
        enterButton.setText("Log In");
        enterButton.setForeground(Color.RED);
        enterButton.setFont(font);
        enterButton.setBounds(450, 650, 200, 100);
        customerEnterPanel.add(enterButton);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(customerEnterPanel);
                frame.add(customerAccountPanel);

                //database den çekilecek

                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(customerEnterPanel);
            frame.add(userEnterPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerEnterPanel.add(prevButton);

        return customerEnterPanel;
    }

    public JPanel SignInPanel() {

        JPanel signInPanel = new JPanel();
        signInPanel.setSize(1000, 1000);
        signInPanel.setLayout(null);

        JLabel label = new JLabel();
        label.setText("Welcome To Farmbank");
        label.setForeground(Color.RED);
        label.setFont(font);
        label.setBounds(450, 150, 500, 50);
        signInPanel.add(label);

        JButton farmerButton = new JButton();
        farmerButton.setText("Register is a Farmer");
        farmerButton.setForeground(Color.RED);
        farmerButton.setFont(font);
        farmerButton.setBounds(400, 300, 350, 100);
        signInPanel.add(farmerButton);
        farmerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(signInPanel);
                frame.add(farmerSignInPanel);
                frame.validate();
                frame.repaint();
            }
        });

        JButton customerButton = new JButton();
        customerButton.setText("Register is a Customer");
        customerButton.setForeground(Color.RED);
        customerButton.setFont(font);
        customerButton.setBounds(400, 450, 350, 100);
        signInPanel.add(customerButton);
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(signInPanel);
                frame.add(customerSignInPanel);
                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(signInPanel);
            frame.add(welcomePanel);
            frame.revalidate();
            frame.repaint();
        });
        signInPanel.add(prevButton);

        return signInPanel;
    }

    public JPanel FarmerSignInPanel() {
        JPanel farmerSignInPanel = new JPanel();
        farmerSignInPanel.setSize(1000, 1000);
        farmerSignInPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        farmerSignInPanel.add(label2);

        JLabel ssnLabel = new JLabel("SSN :");
        ssnLabel.setBounds(350, 100, 300, 25);
        farmerSignInPanel.add(ssnLabel);

        JLabel nameLabel = new JLabel("Name :");
        nameLabel.setBounds(350, 150, 300, 25);
        farmerSignInPanel.add(nameLabel);

        JLabel lastNameLabel = new JLabel("Lastname :");
        lastNameLabel.setBounds(350, 200, 300, 25);
        farmerSignInPanel.add(lastNameLabel);

        JLabel userNameLabel = new JLabel("Username :");
        userNameLabel.setBounds(350, 250, 300, 25);
        farmerSignInPanel.add(userNameLabel);

        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setBounds(350, 300, 300, 20);
        farmerSignInPanel.add(passwordLabel);

        JLabel emailLabel = new JLabel("Email :");
        emailLabel.setBounds(350, 350, 300, 20);
        farmerSignInPanel.add(emailLabel);

        JLabel phoneNumberLabel = new JLabel("Phone Number :");
        phoneNumberLabel.setBounds(350, 400, 300, 20);
        farmerSignInPanel.add(phoneNumberLabel);

        JLabel adressLabel = new JLabel("Adress :");
        adressLabel.setBounds(350, 450, 300, 20);
        farmerSignInPanel.add(adressLabel);
        JTextField userfield = new JTextField();

        JLabel zipLabel = new JLabel("Zip :");
        zipLabel.setBounds(350, 500, 300, 20);
        farmerSignInPanel.add(zipLabel);

        JLabel cityLabel = new JLabel("City :");
        cityLabel.setBounds(350, 550, 300, 20);
        farmerSignInPanel.add(cityLabel);

        JLabel countryLabel = new JLabel("Country :");
        countryLabel.setBounds(350, 600, 300, 20);
        farmerSignInPanel.add(countryLabel);

        JTextField ssnField = new JTextField();
        ssnField.setBounds(450, 100, 200, 25);
        farmerSignInPanel.add(ssnField);

        JTextField nameField = new JTextField();
        nameField.setBounds(450, 150, 200, 25);
        farmerSignInPanel.add(nameField);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(450, 200, 200, 25);
        farmerSignInPanel.add(lastNameField);

        JTextField userNameField = new JTextField();
        userNameField.setBounds(450, 250, 200, 25);
        farmerSignInPanel.add(userNameField);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(450, 300, 200, 25);
        farmerSignInPanel.add(passwordField);

        JTextField emailField = new JTextField();
        emailField.setBounds(450, 350, 200, 25);
        farmerSignInPanel.add(emailField);

        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setBounds(450, 400, 200, 25);
        farmerSignInPanel.add(phoneNumberField);

        JTextField addressField = new JTextField();
        addressField.setBounds(450, 450, 200, 25);
        farmerSignInPanel.add(addressField);

        JTextField zipField = new JTextField();
        zipField.setBounds(450, 500, 200, 25);
        farmerSignInPanel.add(zipField);

        JTextField cityField = new JTextField();
        cityField.setBounds(450, 550, 200, 25);
        farmerSignInPanel.add(cityField);

        JLabel countryField = new JLabel("TURKEY");
        countryField.setBounds(450, 600, 200, 25);
        farmerSignInPanel.add(countryField);

        JButton enterButton = new JButton();
        enterButton.setText("Save");
        enterButton.setForeground(Color.RED);
        enterButton.setFont(font);
        enterButton.setBounds(450, 650, 200, 100);
        farmerSignInPanel.add(enterButton);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(farmerSignInPanel);
                frame.add(welcomePanel);

                //database e ekleme             //Farmer ı database ekleyecek.


                String msg = "Farmer " + nameField.getText() + " " + lastNameField.getText() + " enter successfully to the FARMBANK";
                JOptionPane.showMessageDialog(null, msg);
                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(farmerSignInPanel);
            frame.add(signInPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerSignInPanel.add(prevButton);

        return farmerSignInPanel;
    }

    public JPanel CustomerSignInPanel() {
        JPanel customerSignInPanel = new JPanel();
        customerSignInPanel.setSize(1000, 1000);
        customerSignInPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 0, 500, 50);
        customerSignInPanel.add(label2);

        JLabel ssnLabel = new JLabel("SSN :");
        ssnLabel.setBounds(350, 50, 300, 25);
        customerSignInPanel.add(ssnLabel);

        JLabel nameLabel = new JLabel("Name :");
        nameLabel.setBounds(350, 100, 300, 25);
        customerSignInPanel.add(nameLabel);

        JLabel lastNameLabel = new JLabel("Lastname :");
        lastNameLabel.setBounds(350, 150, 300, 25);
        customerSignInPanel.add(lastNameLabel);

        JLabel userNameLabel = new JLabel("Username :");
        userNameLabel.setBounds(350, 200, 300, 25);
        customerSignInPanel.add(userNameLabel);

        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setBounds(350, 250, 300, 20);
        customerSignInPanel.add(passwordLabel);

        JLabel emailLabel = new JLabel("Email :");
        emailLabel.setBounds(350, 300, 300, 20);
        customerSignInPanel.add(emailLabel);

        JLabel phoneNumberLabel = new JLabel("Phone Number :");
        phoneNumberLabel.setBounds(350, 350, 300, 20);
        customerSignInPanel.add(phoneNumberLabel);

        JLabel adressLabel = new JLabel("Adress :");
        adressLabel.setBounds(350, 400, 300, 20);
        customerSignInPanel.add(adressLabel);
        JTextField userfield = new JTextField();

        JLabel zipLabel = new JLabel("Zip :");
        zipLabel.setBounds(350, 450, 300, 20);
        customerSignInPanel.add(zipLabel);

        JLabel cityLabel = new JLabel("City :");
        cityLabel.setBounds(350, 500, 300, 20);
        customerSignInPanel.add(cityLabel);

        JLabel countryLabel = new JLabel("Country :");
        countryLabel.setBounds(350, 550, 300, 20);
        customerSignInPanel.add(countryLabel);

        JTextField ssnField = new JTextField();
        ssnField.setBounds(450, 50, 200, 25);
        customerSignInPanel.add(ssnField);

        JTextField nameField = new JTextField();
        nameField.setBounds(450, 100, 200, 25);
        customerSignInPanel.add(nameField);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(450, 150, 200, 25);
        customerSignInPanel.add(lastNameField);

        JTextField userNameField = new JTextField();
        userNameField.setBounds(450, 200, 200, 25);
        customerSignInPanel.add(userNameField);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(450, 250, 200, 25);
        customerSignInPanel.add(passwordField);

        JTextField emailField = new JTextField();
        emailField.setBounds(450, 300, 200, 25);
        customerSignInPanel.add(emailField);

        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setBounds(450, 350, 200, 25);
        customerSignInPanel.add(phoneNumberField);

        JTextField addressField = new JTextField();
        addressField.setBounds(450, 400, 200, 25);
        customerSignInPanel.add(addressField);

        JTextField zipField = new JTextField();
        zipField.setBounds(450, 450, 200, 25);
        customerSignInPanel.add(zipField);

        JTextField cityField = new JTextField();
        cityField.setBounds(450, 500, 200, 25);
        customerSignInPanel.add(cityField);

        JLabel countryField = new JLabel("TURKEY");
        countryField.setBounds(450, 550, 200, 25);
        customerSignInPanel.add(countryField);

        JButton enterButton = new JButton();
        enterButton.setText("Save");
        enterButton.setForeground(Color.RED);
        enterButton.setFont(font);
        enterButton.setBounds(450, 650, 200, 100);
        customerSignInPanel.add(enterButton);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(customerSignInPanel);
                frame.add(welcomePanel);

                //database                      //Customer ı database ekleyecek.


                String msg = "User " + nameField.getText() + " " + lastNameField.getText() + " enter successfully to the FARMBANK";
                JOptionPane.showMessageDialog(null, msg);
                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(customerSignInPanel);
            frame.add(signInPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerSignInPanel.add(prevButton);

        return customerSignInPanel;
    }

    public JPanel FarmerAccountPanel() {
        JPanel farmerAccountPanel = new JPanel();
        farmerAccountPanel.setSize(1000, 1000);
        farmerAccountPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font2);
        label2.setBounds(375, 50, 500, 50);
        farmerAccountPanel.add(label2);

        JLabel nameSurnameLabel = new JLabel();
        nameSurnameLabel.setText("İsim Soyisim");   //database den çekilecek
        nameSurnameLabel.setForeground(Color.BLACK);
        nameSurnameLabel.setFont(font);
        nameSurnameLabel.setBounds(800, 50, 200, 50);
        farmerAccountPanel.add(nameSurnameLabel);

        JLabel accountIDLabel = new JLabel();
        accountIDLabel.setText("Account ID");   //database den çekilecek
        accountIDLabel.setForeground(Color.BLACK);
        accountIDLabel.setFont(font);
        accountIDLabel.setBounds(800, 100, 200, 50);
        farmerAccountPanel.add(accountIDLabel);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setText("Balance");   //database den çekilecek
        balanceLabel.setForeground(Color.BLACK);
        balanceLabel.setFont(font);
        balanceLabel.setBounds(800, 150, 200, 50);
        farmerAccountPanel.add(balanceLabel);

        //formatlancak
        JLabel dateTimeLabel = new JLabel();
        dateTimeLabel.setText(String.valueOf(Date.valueOf(LocalDate.now())) + " " + java.time.LocalTime.now());
        dateTimeLabel.setForeground(Color.BLACK);
        dateTimeLabel.setFont(font);
        dateTimeLabel.setBounds(700, 900, 300, 50);
        farmerAccountPanel.add(dateTimeLabel);

        JButton addProductButton = new JButton("ADD PRODUCT");
        addProductButton.setBounds(350, 150, 200, 40);
        addProductButton.addActionListener(e -> {
            frame.remove(farmerAccountPanel);
            frame.add(addProductPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAccountPanel.add(addProductButton);

        JButton myWalletButton = new JButton("MY WALLET");
        myWalletButton.setBounds(350, 200, 200, 40);
        myWalletButton.addActionListener(e -> {
            frame.remove(farmerAccountPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAccountPanel.add(myWalletButton);

        JButton soldProductsButton = new JButton("SOLD PRODUCTS");
        soldProductsButton.setBounds(350, 250, 200, 40);
        soldProductsButton.addActionListener(e -> {
            frame.remove(farmerAccountPanel);
            frame.add(soldProductsPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAccountPanel.add(soldProductsButton);

        JButton myProductsButton = new JButton("MY PRODUCTS");
        myProductsButton.setBounds(350, 300, 200, 40);
        myProductsButton.addActionListener(e -> {
            frame.remove(farmerAccountPanel);
            frame.add(myProductsPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAccountPanel.add(myProductsButton);

        JButton manageAccountButton = new JButton("MANAGE ACCOUNT");
        manageAccountButton.setBounds(350, 350, 200, 40);
        manageAccountButton.addActionListener(e -> {
            frame.remove(farmerAccountPanel);
            frame.add(farmerManageAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAccountPanel.add(manageAccountButton);

        //KONUŞULACAK
//        JButton statisticsButton = new JButton("STATISTICS");
//        statisticsButton.setBounds(350, 150, 200, 40);
//        statisticsButton.addActionListener(e -> {
//            frame.remove(farmerAccountPanel);
//            //frame.add(statisticsPanel);
//            frame.revalidate();
//            frame.repaint();
//        });
//        farmerAccountPanel.add(statisticsButton);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(farmerAccountPanel);
            frame.add(farmerEnterPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAccountPanel.add(prevButton);

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(10, 900, 150, 40);
        exitButton.addActionListener(e -> {
            frame.remove(farmerAccountPanel);
            frame.add(welcomePanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAccountPanel.add(exitButton);

        return farmerAccountPanel;
    }

    public JPanel AddProductPanel() {
        JPanel addProductPanel = new JPanel();
        addProductPanel.setSize(1000, 1000);
        addProductPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        addProductPanel.add(label2);

        JLabel infoLabel = new JLabel("Please Enter the informations for the product you want to sell :");
        infoLabel.setBounds(300, 150, 500, 40);
        addProductPanel.add(infoLabel);

        JLabel productNameLabel = new JLabel("NAME :");
        productNameLabel.setBounds(300, 200, 100, 25);
        addProductPanel.add(productNameLabel);

        JLabel ammountLabel = new JLabel("AMOUNT :");
        ammountLabel.setBounds(300, 250, 100, 25);
        addProductPanel.add(ammountLabel);

        JLabel perPriceLabel = new JLabel("PRICE PER UNIT :");
        perPriceLabel.setBounds(300, 300, 100, 25);
        addProductPanel.add(perPriceLabel);

        JLabel descriptionLabel = new JLabel("DESCRIPTION :");
        descriptionLabel.setBounds(300, 350, 100, 25);
        addProductPanel.add(descriptionLabel);

        JTextField productNameField = new JTextField();
        productNameField.setBounds(400, 200, 200, 25);
        addProductPanel.add(productNameField);

        JTextField amountField = new JTextField();
        amountField.setBounds(400, 250, 200, 25);
        addProductPanel.add(amountField);

        JTextField perPriceField = new JTextField();
        perPriceField.setBounds(400, 300, 200, 25);
        addProductPanel.add(perPriceField);

        JTextField descriptionField = new JTextField();
        descriptionField.setBounds(400, 350, 200, 25);
        addProductPanel.add(descriptionField);

        JButton addProductButton = new JButton();
        addProductButton.setText("ADD PRODUCT");
        addProductButton.setForeground(Color.RED);
        addProductButton.setFont(font);
        addProductButton.setBounds(300, 400, 300, 100);
        addProductPanel.add(addProductButton);

        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(addProductPanel);
                frame.add(farmerAccountPanel);

                //database e ekleme             //Farmer ı database ekleyecek.


                String msg = "YOUR PRODUCT HAS BEEN ADDED SUCCESFULLY";
                JOptionPane.showMessageDialog(null, msg);
                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(addProductPanel);
            frame.add(farmerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        addProductPanel.add(prevButton);


        return addProductPanel;
    }

    public JPanel MyFarmerWalletPanel() {

        JPanel myFarmerWalletPanel = new JPanel();
        myFarmerWalletPanel.setSize(1000, 1000);
        myFarmerWalletPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font2);
        label2.setBounds(375, 50, 500, 50);
        myFarmerWalletPanel.add(label2);

        //İSİM SOY İSİM KISMI DATABASE DEN ÇEKİLECEK GERİ KALANLA BİRLEŞECEK
        JLabel infoLabel = new JLabel();
        infoLabel.setText("İSİM SOY İSİM " + "  ' S WALLET");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font2);
        infoLabel.setBounds(225, 150, 500, 50);
        myFarmerWalletPanel.add(infoLabel);

        JButton depositButton = new JButton("DEPOSİT");
        depositButton.setBounds(350, 250, 200, 40);
        depositButton.addActionListener(e -> {
            frame.remove(myFarmerWalletPanel);
            frame.add(farmerDepositPanel);
            frame.revalidate();
            frame.repaint();
        });
        myFarmerWalletPanel.add(depositButton);

        JButton withdrawButton = new JButton("WITHDRAW");
        withdrawButton.setBounds(350, 300, 200, 40);
        withdrawButton.addActionListener(e -> {
            frame.remove(myFarmerWalletPanel);
            frame.add(farmerWithdrawPanel);
            frame.revalidate();
            frame.repaint();
        });
        myFarmerWalletPanel.add(withdrawButton);

        JButton accountActivitiesButton = new JButton("ACCOUNT ACTIVITIES");
        accountActivitiesButton.setBounds(350, 350, 200, 40);
        accountActivitiesButton.addActionListener(e -> {
            frame.remove(myFarmerWalletPanel);
            frame.add(farmerAcccountActivitiesPanel);
            frame.revalidate();
            frame.repaint();
        });
        myFarmerWalletPanel.add(accountActivitiesButton);

        JLabel accountIDLabel = new JLabel();
        accountIDLabel.setText("Account ID");   //database den çekilecek
        accountIDLabel.setForeground(Color.BLACK);
        accountIDLabel.setFont(font);
        accountIDLabel.setBounds(800, 100, 200, 50);
        myFarmerWalletPanel.add(accountIDLabel);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setText("Balance");   //database den çekilecek
        balanceLabel.setForeground(Color.BLACK);
        balanceLabel.setFont(font);
        balanceLabel.setBounds(800, 150, 200, 50);
        myFarmerWalletPanel.add(balanceLabel);

        //formatlancak
        JLabel dateTimeLabel = new JLabel();
        dateTimeLabel.setText(String.valueOf(Date.valueOf(LocalDate.now())) + " " + java.time.LocalTime.now());
        dateTimeLabel.setForeground(Color.BLACK);
        dateTimeLabel.setFont(font);
        dateTimeLabel.setBounds(700, 900, 300, 50);
        myFarmerWalletPanel.add(dateTimeLabel);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(myFarmerWalletPanel);
            frame.add(farmerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        myFarmerWalletPanel.add(prevButton);
        return myFarmerWalletPanel;
    }

    public JPanel FarmerDepositPanel(){
        JPanel farmerDepositPanel = new JPanel();
        farmerDepositPanel.setSize(1000, 1000);
        farmerDepositPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        farmerDepositPanel.add(label2);

        JLabel infoLabel = new JLabel();
        infoLabel.setText("Please Choose The Amount You Want To deposit");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font);
        infoLabel.setBounds(150, 100, 800, 50);
        farmerDepositPanel.add(infoLabel);

        JButton moneyButton = new JButton("500");
        moneyButton.setBounds(350, 200, 150, 40);
        moneyButton.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "500 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerDepositPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerDepositPanel.add(moneyButton);

        JButton money1Button = new JButton("1.000");
        money1Button.setBounds(350, 250, 150, 40);
        money1Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "1.000 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerDepositPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerDepositPanel.add(money1Button);

        JButton money2Button = new JButton("2.500");
        money2Button.setBounds(350, 300, 150, 40);
        money2Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "2.500 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerDepositPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerDepositPanel.add(money2Button);

        JButton money3Button = new JButton("5.000");
        money3Button.setBounds(350, 350, 150, 40);
        money3Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "5.000 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerDepositPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerDepositPanel.add(money3Button);

        JButton money4Button = new JButton("10.000");
        money4Button.setBounds(350, 400, 150, 40);
        money4Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "10.000 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerDepositPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerDepositPanel.add(money4Button);

        JLabel moneyLAbel = new JLabel("ENTER YOUR OWN AMOUNT");
        moneyLAbel.setBounds(170, 550, 300, 25);
        farmerDepositPanel.add(moneyLAbel);

        JTextField amountField = new JTextField();
        amountField.setBounds(350, 550, 150, 25);
        farmerDepositPanel.add(amountField);

        JButton enterButtonForField = new JButton("ENTER");
        enterButtonForField.setBounds(350, 600, 150, 40);
        enterButtonForField.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = amountField.getName() + " TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerDepositPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerDepositPanel.add(enterButtonForField);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(farmerDepositPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerDepositPanel.add(prevButton);

        return farmerDepositPanel;
    }

    public JPanel FarmerWithdrawPanel(){
        JPanel farmerWithdrawPanel = new JPanel();
        farmerWithdrawPanel.setSize(1000, 1000);
        farmerWithdrawPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        farmerWithdrawPanel.add(label2);

        JLabel infoLabel = new JLabel();
        infoLabel.setText("Please Choose The Amount You Want To Withdraw");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font);
        infoLabel.setBounds(150, 100, 800, 50);
        farmerWithdrawPanel.add(infoLabel);

        JButton moneyButton = new JButton("500");
        moneyButton.setBounds(350, 200, 150, 40);
        moneyButton.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "500 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerWithdrawPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerWithdrawPanel.add(moneyButton);

        JButton money1Button = new JButton("1.000");
        money1Button.setBounds(350, 250, 150, 40);
        money1Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "1.000 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerWithdrawPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerWithdrawPanel.add(money1Button);

        JButton money2Button = new JButton("2.500");
        money2Button.setBounds(350, 300, 150, 40);
        money2Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "2.500 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerWithdrawPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerWithdrawPanel.add(money2Button);

        JButton money3Button = new JButton("5.000");
        money3Button.setBounds(350, 350, 150, 40);
        money3Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "5.000 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerWithdrawPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerWithdrawPanel.add(money3Button);

        JButton money4Button = new JButton("10.000");
        money4Button.setBounds(350, 400, 150, 40);
        money4Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "10.000 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerWithdrawPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerWithdrawPanel.add(money4Button);

        JLabel moneyLAbel = new JLabel("ENTER YOUR OWN AMOUNT");
        moneyLAbel.setBounds(170, 550, 300, 25);
        farmerWithdrawPanel.add(moneyLAbel);

        JTextField amountField = new JTextField();
        amountField.setBounds(350, 550, 150, 25);
        farmerWithdrawPanel.add(amountField);

        JButton enterButtonForField = new JButton("ENTER");
        enterButtonForField.setBounds(350, 600, 150, 40);
        enterButtonForField.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = amountField.getName() + " TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(farmerWithdrawPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerWithdrawPanel.add(enterButtonForField);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(farmerWithdrawPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerWithdrawPanel.add(prevButton);

        return farmerWithdrawPanel;
    }

    public JPanel FarmerAcccountActivitiesPanel(){
        JPanel farmerAcccountActivitiesPanel = new JPanel();
        farmerAcccountActivitiesPanel.setSize(1000, 1000);
        farmerAcccountActivitiesPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        farmerAcccountActivitiesPanel.add(label2);

        //İSİM SOY İSİM KISMI DATABASE DEN ÇEKİLECEK GERİ KALANLA BİRLEŞECEK
        JLabel infoLabel = new JLabel();
        infoLabel.setText("İSİM SOY İSİM " + "  ' S ACCOUNT ACTIVITIES");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font2);
        infoLabel.setBounds(225, 150, 800, 50);
        farmerAcccountActivitiesPanel.add(infoLabel);

        //BURADA ACCOUNT ACTIVITIES LERİNİ TABLO OLARAK PAYLAŞACAZ.
        //
        //
        //

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(farmerAcccountActivitiesPanel);
            frame.add(myFarmerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerAcccountActivitiesPanel.add(prevButton);

        return farmerAcccountActivitiesPanel;
    }

    public JPanel SoldProductsPanel() {
        JPanel soldProductsPanel = new JPanel();
        soldProductsPanel.setSize(1000, 1000);
        soldProductsPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        soldProductsPanel.add(label2);

        //İSİM SOY İSİM KISMI DATABASE DEN ÇEKİLECEK GERİ KALANLA BİRLEŞECEK
        JLabel infoLabel = new JLabel();
        infoLabel.setText("İSİM SOY İSİM " + "  ' S SOLD PRODUCTS");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font2);
        infoLabel.setBounds(225, 150, 800, 50);
        soldProductsPanel.add(infoLabel);

        //BURADA SAHİP OLDUĞU ÜRÜNLERİ TABLO OLARAK PAYLAŞACAZ.
        //
        //
        //

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(soldProductsPanel);
            frame.add(farmerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        soldProductsPanel.add(prevButton);

        return soldProductsPanel;
    }

    public JPanel MyProductsPanel() {
        JPanel myProductsPanel = new JPanel();
        myProductsPanel.setSize(1000, 1000);
        myProductsPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        myProductsPanel.add(label2);

        //İSİM SOY İSİM KISMI DATABASE DEN ÇEKİLECEK GERİ KALANLA BİRLEŞECEK
        JLabel infoLabel = new JLabel();
        infoLabel.setText("İSİM SOY İSİM " + "  ' S PRODUCTS");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font2);
        infoLabel.setBounds(225, 150, 700, 50);
        myProductsPanel.add(infoLabel);

        //BURADA SAHİP OLDUĞU ÜRÜNLERİ TABLO OLARAK PAYLAŞACAZ.
        //
        //
        //

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(myProductsPanel);
            frame.add(farmerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        myProductsPanel.add(prevButton);

        return myProductsPanel;
    }

    public JPanel ManageFarmerAccountPanel() {
        JPanel farmerManageAccountPanel = new JPanel();
        farmerManageAccountPanel.setSize(1000, 1000);
        farmerManageAccountPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        farmerManageAccountPanel.add(label2);

        JLabel ssnLabel = new JLabel("SSN :");
        ssnLabel.setBounds(350, 100, 300, 25);
        farmerManageAccountPanel.add(ssnLabel);

        JLabel nameLabel = new JLabel("Name :");
        nameLabel.setBounds(350, 150, 300, 25);
        farmerManageAccountPanel.add(nameLabel);

        JLabel lastNameLabel = new JLabel("Lastname :");
        lastNameLabel.setBounds(350, 200, 300, 25);
        farmerManageAccountPanel.add(lastNameLabel);

        JLabel userNameLabel = new JLabel("Username :");
        userNameLabel.setBounds(350, 250, 300, 25);
        farmerManageAccountPanel.add(userNameLabel);

        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setBounds(350, 300, 300, 20);
        farmerManageAccountPanel.add(passwordLabel);

        JLabel emailLabel = new JLabel("Email :");
        emailLabel.setBounds(350, 350, 300, 20);
        farmerManageAccountPanel.add(emailLabel);

        JLabel phoneNumberLabel = new JLabel("Phone Number :");
        phoneNumberLabel.setBounds(350, 400, 300, 20);
        farmerManageAccountPanel.add(phoneNumberLabel);

        JLabel adressLabel = new JLabel("Adress :");
        adressLabel.setBounds(350, 450, 300, 20);
        farmerManageAccountPanel.add(adressLabel);
        JTextField userfield = new JTextField();

        JLabel zipLabel = new JLabel("Zip :");
        zipLabel.setBounds(350, 500, 300, 20);
        farmerManageAccountPanel.add(zipLabel);

        JLabel cityLabel = new JLabel("City :");
        cityLabel.setBounds(350, 550, 300, 20);
        farmerManageAccountPanel.add(cityLabel);

        JLabel countryLabel = new JLabel("Country :");
        countryLabel.setBounds(350, 600, 300, 20);
        farmerManageAccountPanel.add(countryLabel);

        JTextField ssnField = new JTextField();
        ssnField.setBounds(450, 100, 200, 25);
        farmerManageAccountPanel.add(ssnField);

        JTextField nameField = new JTextField();
        nameField.setBounds(450, 150, 200, 25);
        farmerManageAccountPanel.add(nameField);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(450, 200, 200, 25);
        farmerManageAccountPanel.add(lastNameField);

        JTextField userNameField = new JTextField();
        userNameField.setBounds(450, 250, 200, 25);
        farmerManageAccountPanel.add(userNameField);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(450, 300, 200, 25);
        farmerManageAccountPanel.add(passwordField);

        JTextField emailField = new JTextField();
        emailField.setBounds(450, 350, 200, 25);
        farmerManageAccountPanel.add(emailField);

        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setBounds(450, 400, 200, 25);
        farmerManageAccountPanel.add(phoneNumberField);

        JTextField addressField = new JTextField();
        addressField.setBounds(450, 450, 200, 25);
        farmerManageAccountPanel.add(addressField);

        JTextField zipField = new JTextField();
        zipField.setBounds(450, 500, 200, 25);
        farmerManageAccountPanel.add(zipField);

        JTextField cityField = new JTextField();
        cityField.setBounds(450, 550, 200, 25);
        farmerManageAccountPanel.add(cityField);

        JLabel countryField = new JLabel("TURKEY");
        countryField.setBounds(450, 600, 200, 25);
        farmerManageAccountPanel.add(countryField);

        JButton updateButton = new JButton();
        updateButton.setText("UPDATE");
        updateButton.setForeground(Color.RED);
        updateButton.setFont(font);
        updateButton.setBounds(450, 650, 200, 100);
        farmerManageAccountPanel.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(farmerManageAccountPanel);
                frame.add(farmerAccountPanel);

                //database e ekleme             //Farmer ı database ekleyecek.


                String msg = "YOUR ACCOUNT HAS BEEN UPDATED SUCCESFULLY";
                JOptionPane.showMessageDialog(null, msg);
                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(farmerManageAccountPanel);
            frame.add(farmerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        farmerManageAccountPanel.add(prevButton);

        return farmerManageAccountPanel;
    }

    public JPanel CustomerAccountPanel() {
        JPanel customerAccountPanel = new JPanel();
        customerAccountPanel.setSize(1000, 1000);
        customerAccountPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font2);
        label2.setBounds(375, 50, 500, 50);
        customerAccountPanel.add(label2);

        JLabel nameSurnameLabel = new JLabel();
        nameSurnameLabel.setText("İsim Soyisim");   //database den çekilecek
        nameSurnameLabel.setForeground(Color.BLACK);
        nameSurnameLabel.setFont(font);
        nameSurnameLabel.setBounds(800, 50, 300, 50);
        customerAccountPanel.add(nameSurnameLabel);

        JLabel accountIDLabel = new JLabel();
        accountIDLabel.setText("Account ID");   //database den çekilecek
        accountIDLabel.setForeground(Color.BLACK);
        accountIDLabel.setFont(font);
        accountIDLabel.setBounds(800, 100, 300, 50);
        customerAccountPanel.add(accountIDLabel);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setText("Balance");   //database den çekilecek
        balanceLabel.setForeground(Color.BLACK);
        balanceLabel.setFont(font);
        balanceLabel.setBounds(800, 150, 300, 50);
        customerAccountPanel.add(balanceLabel);

        //formatlancak
        JLabel dateTimeLabel = new JLabel();
        dateTimeLabel.setText(String.valueOf(Date.valueOf(LocalDate.now())) + " " + java.time.LocalTime.now());
        dateTimeLabel.setForeground(Color.BLACK);
        dateTimeLabel.setFont(font);
        dateTimeLabel.setBounds(700, 900, 300, 50);
        customerAccountPanel.add(dateTimeLabel);

        JButton buyProductButton = new JButton("BUY PRODUCT");
        buyProductButton.setBounds(350, 150, 200, 40);
        buyProductButton.addActionListener(e -> {
            frame.remove(customerAccountPanel);
            frame.add(buyProductPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerAccountPanel.add(buyProductButton);

        JButton myWalletButton = new JButton("MY WALLET");
        myWalletButton.setBounds(350, 200, 200, 40);
        myWalletButton.addActionListener(e -> {
            frame.remove(customerAccountPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerAccountPanel.add(myWalletButton);

        JButton myOrdersButton = new JButton("MY ORDERS");
        myOrdersButton.setBounds(350, 250, 200, 40);
        myOrdersButton.addActionListener(e -> {
            frame.remove(customerAccountPanel);
            frame.add(myOrdersPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerAccountPanel.add(myOrdersButton);

        JButton manageAccountButton = new JButton("MANAGE ACCOUNT");
        manageAccountButton.setBounds(350, 300, 200, 40);
        manageAccountButton.addActionListener(e -> {
            frame.remove(customerAccountPanel);
            frame.add(customerManageAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerAccountPanel.add(manageAccountButton);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(customerAccountPanel);
            frame.add(customerEnterPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerAccountPanel.add(prevButton);

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(10, 900, 150, 40);
        exitButton.addActionListener(e -> {
            frame.remove(customerAccountPanel);
            frame.add(welcomePanel);
            frame.revalidate();
            frame.repaint();
        });
        customerAccountPanel.add(exitButton);

        return customerAccountPanel;
    }

    public JPanel BuyProductPanel() {
        JPanel buyProductPanel = new JPanel();
        buyProductPanel.setSize(1000, 1000);
        buyProductPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font2);
        label2.setBounds(375, 50, 500, 50);
        buyProductPanel.add(label2);

        JLabel nameSurnameLabel = new JLabel();
        nameSurnameLabel.setText("İsim Soyisim");   //database den çekilecek
        nameSurnameLabel.setForeground(Color.BLACK);
        nameSurnameLabel.setFont(font);
        nameSurnameLabel.setBounds(800, 50, 300, 50);
        buyProductPanel.add(nameSurnameLabel);

        JLabel accountIDLabel = new JLabel();
        accountIDLabel.setText("Account ID");   //database den çekilecek
        accountIDLabel.setForeground(Color.BLACK);
        accountIDLabel.setFont(font);
        accountIDLabel.setBounds(800, 100, 300, 50);
        buyProductPanel.add(accountIDLabel);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setText("Balance");   //database den çekilecek
        balanceLabel.setForeground(Color.BLACK);
        balanceLabel.setFont(font);
        balanceLabel.setBounds(800, 150, 300, 50);
        buyProductPanel.add(balanceLabel);

        JLabel locationLabel = new JLabel();
        locationLabel.setText("Location");   //database den çekilecek
        locationLabel.setForeground(Color.BLACK);
        locationLabel.setFont(font);
        locationLabel.setBounds(800, 200, 300, 50);
        buyProductPanel.add(locationLabel);


        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(buyProductPanel);
            frame.add(customerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        buyProductPanel.add(prevButton);

        return buyProductPanel;
    }

    public JPanel MyCustomerWalletPanel() {
        JPanel myCustomerWalletPanel = new JPanel();
        myCustomerWalletPanel.setSize(1000, 1000);
        myCustomerWalletPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font2);
        label2.setBounds(375, 50, 500, 50);
        myCustomerWalletPanel.add(label2);

        //İSİM SOY İSİM KISMI DATABASE DEN ÇEKİLECEK GERİ KALANLA BİRLEŞECEK
        JLabel infoLabel = new JLabel();
        infoLabel.setText("İSİM SOY İSİM " + "  ' S WALLET");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font2);
        infoLabel.setBounds(225, 150, 500, 50);
        myCustomerWalletPanel.add(infoLabel);

        JButton depositButton = new JButton("DEPOSİT");
        depositButton.setBounds(350, 250, 200, 40);
        depositButton.addActionListener(e -> {
            frame.remove(myCustomerWalletPanel);
            frame.add(customerDepositPanel);
            frame.revalidate();
            frame.repaint();
        });
        myCustomerWalletPanel.add(depositButton);

        JButton withdrawButton = new JButton("WITHDRAW");
        withdrawButton.setBounds(350, 300, 200, 40);
        withdrawButton.addActionListener(e -> {
            frame.remove(myCustomerWalletPanel);
            frame.add(customerWithdrawPanel);
            frame.revalidate();
            frame.repaint();
        });
        myCustomerWalletPanel.add(withdrawButton);

        JButton accountActivitiesButton = new JButton("ACCOUNT ACTIVITIES");
        accountActivitiesButton.setBounds(350, 350, 200, 40);
        accountActivitiesButton.addActionListener(e -> {
            frame.remove(myCustomerWalletPanel);
            frame.add(customerAccountActivitiesPanel);
            frame.revalidate();
            frame.repaint();
        });
        myCustomerWalletPanel.add(accountActivitiesButton);

        JLabel accountIDLabel = new JLabel();
        accountIDLabel.setText("Account ID");   //database den çekilecek
        accountIDLabel.setForeground(Color.BLACK);
        accountIDLabel.setFont(font);
        accountIDLabel.setBounds(800, 100, 200, 50);
        myCustomerWalletPanel.add(accountIDLabel);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setText("Balance");   //database den çekilecek
        balanceLabel.setForeground(Color.BLACK);
        balanceLabel.setFont(font);
        balanceLabel.setBounds(800, 150, 200, 50);
        myCustomerWalletPanel.add(balanceLabel);

        //formatlancak
        JLabel dateTimeLabel = new JLabel();
        dateTimeLabel.setText(String.valueOf(Date.valueOf(LocalDate.now())) + " " + java.time.LocalTime.now());
        dateTimeLabel.setForeground(Color.BLACK);
        dateTimeLabel.setFont(font);
        dateTimeLabel.setBounds(700, 900, 300, 50);
        myCustomerWalletPanel.add(dateTimeLabel);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(myCustomerWalletPanel);
            frame.add(customerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        myCustomerWalletPanel.add(prevButton);
        return myCustomerWalletPanel;
    }

    public JPanel CustomerDepositPanel(){
        JPanel customerDepositPanel = new JPanel();
        customerDepositPanel.setSize(1000, 1000);
        customerDepositPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        customerDepositPanel.add(label2);

        JLabel infoLabel = new JLabel();
        infoLabel.setText("Please Choose The Amount You Want To deposit");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font);
        infoLabel.setBounds(150, 100, 800, 50);
        customerDepositPanel.add(infoLabel);

        JButton moneyButton = new JButton("500");
        moneyButton.setBounds(350, 200, 150, 40);
        moneyButton.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "500 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerDepositPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerDepositPanel.add(moneyButton);

        JButton money1Button = new JButton("1.000");
        money1Button.setBounds(350, 250, 150, 40);
        money1Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "1.000 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerDepositPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerDepositPanel.add(money1Button);

        JButton money2Button = new JButton("2.500");
        money2Button.setBounds(350, 300, 150, 40);
        money2Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "2.500 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerDepositPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerDepositPanel.add(money2Button);

        JButton money3Button = new JButton("5.000");
        money3Button.setBounds(350, 350, 150, 40);
        money3Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "5.000 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerDepositPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerDepositPanel.add(money3Button);

        JButton money4Button = new JButton("10.000");
        money4Button.setBounds(350, 400, 150, 40);
        money4Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "10.000 TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerDepositPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerDepositPanel.add(money4Button);

        JLabel moneyLAbel = new JLabel("ENTER YOUR OWN AMOUNT");
        moneyLAbel.setBounds(170, 550, 300, 25);
        customerDepositPanel.add(moneyLAbel);

        JTextField amountField = new JTextField();
        amountField.setBounds(350, 550, 150, 25);
        customerDepositPanel.add(amountField);

        JButton enterButtonForField = new JButton("ENTER");
        enterButtonForField.setBounds(350, 600, 150, 40);
        enterButtonForField.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = amountField.getName() + " TURKISH LIRA HAS BEEN ADDED TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerDepositPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerDepositPanel.add(enterButtonForField);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(customerDepositPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerDepositPanel.add(prevButton);

        return customerDepositPanel;
    }

    public JPanel CustomerWithdrawPanel(){
        JPanel customerWithdrawPanel = new JPanel();
        customerWithdrawPanel.setSize(1000, 1000);
        customerWithdrawPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        customerWithdrawPanel.add(label2);

        JLabel infoLabel = new JLabel();
        infoLabel.setText("Please Choose The Amount You Want To Withdraw");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font);
        infoLabel.setBounds(150, 100, 800, 50);
        customerWithdrawPanel.add(infoLabel);

        JButton moneyButton = new JButton("500");
        moneyButton.setBounds(350, 200, 150, 40);
        moneyButton.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "500 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerWithdrawPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerWithdrawPanel.add(moneyButton);

        JButton money1Button = new JButton("1.000");
        money1Button.setBounds(350, 250, 150, 40);
        money1Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "1.000 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerWithdrawPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerWithdrawPanel.add(money1Button);

        JButton money2Button = new JButton("2.500");
        money2Button.setBounds(350, 300, 150, 40);
        money2Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "2.500 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerWithdrawPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerWithdrawPanel.add(money2Button);

        JButton money3Button = new JButton("5.000");
        money3Button.setBounds(350, 350, 150, 40);
        money3Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "5.000 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerWithdrawPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerWithdrawPanel.add(money3Button);

        JButton money4Button = new JButton("10.000");
        money4Button.setBounds(350, 400, 150, 40);
        money4Button.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = "10.000 TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerWithdrawPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerWithdrawPanel.add(money4Button);

        JLabel moneyLAbel = new JLabel("ENTER YOUR OWN AMOUNT");
        moneyLAbel.setBounds(170, 550, 300, 25);
        customerWithdrawPanel.add(moneyLAbel);

        JTextField amountField = new JTextField();
        amountField.setBounds(350, 550, 150, 25);
        customerWithdrawPanel.add(amountField);

        JButton enterButtonForField = new JButton("ENTER");
        enterButtonForField.setBounds(350, 600, 150, 40);
        enterButtonForField.addActionListener(e -> {
            //DATABASE DEN HESABA PARA EKLENECEK.

            String msg = amountField.getName() + " TURKISH LIRA HAS BEEN WITHDRAW TO ACCOUNT";
            JOptionPane.showMessageDialog(null, msg);

            frame.remove(customerWithdrawPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerWithdrawPanel.add(enterButtonForField);

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(customerWithdrawPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerWithdrawPanel.add(prevButton);

        return customerWithdrawPanel;
    }

    public JPanel CustomerAccountActivitiesPanel(){
        JPanel customerAccountActivitiesPanel = new JPanel();
        customerAccountActivitiesPanel.setSize(1000, 1000);
        customerAccountActivitiesPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        customerAccountActivitiesPanel.add(label2);

        //İSİM SOY İSİM KISMI DATABASE DEN ÇEKİLECEK GERİ KALANLA BİRLEŞECEK
        JLabel infoLabel = new JLabel();
        infoLabel.setText("İSİM SOY İSİM " + "  ' S ACCOUNT ACTIVITIES");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font2);
        infoLabel.setBounds(225, 150, 800, 50);
        customerAccountActivitiesPanel.add(infoLabel);

        //BURADA ACCOUNT ACTIVITIES LERİNİ TABLO OLARAK PAYLAŞACAZ.
        //
        //
        //

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(customerAccountActivitiesPanel);
            frame.add(myCustomerWalletPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerAccountActivitiesPanel.add(prevButton);

        return customerAccountActivitiesPanel;
    }

    public JPanel MyOrdersPanel() {
        JPanel myOrdersPanel = new JPanel();
        myOrdersPanel.setSize(1000, 1000);
        myOrdersPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        myOrdersPanel.add(label2);

        //İSİM SOY İSİM KISMI DATABASE DEN ÇEKİLECEK GERİ KALANLA BİRLEŞECEK
        JLabel infoLabel = new JLabel();
        infoLabel.setText("İSİM SOY İSİM " + "  ' S ORDERS");
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setFont(font2);
        infoLabel.setBounds(225, 150, 700, 50);
        myOrdersPanel.add(infoLabel);

        //BURADA SAHİP OLDUĞU SİPARİŞLERİ TABLO OLARAK PAYLAŞACAZ.
        //
        //
        //

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(myOrdersPanel);
            frame.add(customerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        myOrdersPanel.add(prevButton);

        return myOrdersPanel;
    }

    public JPanel ManageCustomerAccountPanel() {
        JPanel customerManageAccountPanel = new JPanel();
        customerManageAccountPanel.setSize(1000, 1000);
        customerManageAccountPanel.setLayout(null);

        JLabel label2 = new JLabel();
        label2.setText("FarmBank");
        label2.setForeground(Color.RED);
        label2.setFont(font);
        label2.setBounds(450, 50, 500, 50);
        customerManageAccountPanel.add(label2);

        JLabel ssnLabel = new JLabel("SSN :");
        ssnLabel.setBounds(350, 100, 300, 25);
        customerManageAccountPanel.add(ssnLabel);

        JLabel nameLabel = new JLabel("Name :");
        nameLabel.setBounds(350, 150, 300, 25);
        customerManageAccountPanel.add(nameLabel);

        JLabel lastNameLabel = new JLabel("Lastname :");
        lastNameLabel.setBounds(350, 200, 300, 25);
        customerManageAccountPanel.add(lastNameLabel);

        JLabel userNameLabel = new JLabel("Username :");
        userNameLabel.setBounds(350, 250, 300, 25);
        customerManageAccountPanel.add(userNameLabel);

        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setBounds(350, 300, 300, 20);
        customerManageAccountPanel.add(passwordLabel);

        JLabel emailLabel = new JLabel("Email :");
        emailLabel.setBounds(350, 350, 300, 20);
        customerManageAccountPanel.add(emailLabel);

        JLabel phoneNumberLabel = new JLabel("Phone Number :");
        phoneNumberLabel.setBounds(350, 400, 300, 20);
        customerManageAccountPanel.add(phoneNumberLabel);

        JLabel adressLabel = new JLabel("Adress :");
        adressLabel.setBounds(350, 450, 300, 20);
        customerManageAccountPanel.add(adressLabel);
        JTextField userfield = new JTextField();

        JLabel zipLabel = new JLabel("Zip :");
        zipLabel.setBounds(350, 500, 300, 20);
        customerManageAccountPanel.add(zipLabel);

        JLabel cityLabel = new JLabel("City :");
        cityLabel.setBounds(350, 550, 300, 20);
        customerManageAccountPanel.add(cityLabel);

        JLabel countryLabel = new JLabel("Country :");
        countryLabel.setBounds(350, 600, 300, 20);
        customerManageAccountPanel.add(countryLabel);

        JTextField ssnField = new JTextField();
        ssnField.setBounds(450, 100, 200, 25);
        customerManageAccountPanel.add(ssnField);

        JTextField nameField = new JTextField();
        nameField.setBounds(450, 150, 200, 25);
        customerManageAccountPanel.add(nameField);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(450, 200, 200, 25);
        customerManageAccountPanel.add(lastNameField);

        JTextField userNameField = new JTextField();
        userNameField.setBounds(450, 250, 200, 25);
        customerManageAccountPanel.add(userNameField);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(450, 300, 200, 25);
        customerManageAccountPanel.add(passwordField);

        JTextField emailField = new JTextField();
        emailField.setBounds(450, 350, 200, 25);
        customerManageAccountPanel.add(emailField);

        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setBounds(450, 400, 200, 25);
        customerManageAccountPanel.add(phoneNumberField);

        JTextField addressField = new JTextField();
        addressField.setBounds(450, 450, 200, 25);
        customerManageAccountPanel.add(addressField);

        JTextField zipField = new JTextField();
        zipField.setBounds(450, 500, 200, 25);
        customerManageAccountPanel.add(zipField);

        JTextField cityField = new JTextField();
        cityField.setBounds(450, 550, 200, 25);
        customerManageAccountPanel.add(cityField);

        JLabel countryField = new JLabel("TURKEY");
        countryField.setBounds(450, 600, 200, 25);
        customerManageAccountPanel.add(countryField);

        JButton updateButton = new JButton();
        updateButton.setText("UPDATE");
        updateButton.setForeground(Color.RED);
        updateButton.setFont(font);
        updateButton.setBounds(450, 650, 200, 100);
        customerManageAccountPanel.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(customerManageAccountPanel);
                frame.add(customerAccountPanel);

                //database e ekleme             //Farmer ı database ekleyecek.


                String msg = "YOUR ACCOUNT HAS BEEN UPDATED SUCCESFULLY";
                JOptionPane.showMessageDialog(null, msg);
                frame.validate();
                frame.repaint();
            }
        });

        JButton prevButton = new JButton("BACK");
        prevButton.setBounds(10, 10, 150, 40);
        prevButton.addActionListener(e -> {
            frame.remove(customerManageAccountPanel);
            frame.add(customerAccountPanel);
            frame.revalidate();
            frame.repaint();
        });
        customerManageAccountPanel.add(prevButton);

        return customerManageAccountPanel;
    }

}