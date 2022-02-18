/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Create;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.Cars;

/**
 *
 * @author gaurav
 */
public class CreateCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form fderg
     */
    
    
    private JPanel userProcessContainer;
    private Cars cars;
    private List<Car> cars1;
    
    public CreateCarJPanel(JPanel upc , Cars c) {
        cars = c;
        cars1 = c.getAllCars();
        initComponents();
        userProcessContainer = upc;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        txtManufacturer = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtManufatctureYear = new javax.swing.JTextField();
        txtSeatsNumber = new javax.swing.JTextField();
        txtSerialNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtMaintainanceCertificateDate = new javax.swing.JTextField();
        lblManufacturer = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblManufactureYear = new javax.swing.JLabel();
        lblSeatsNumber = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblMaintainanceCertificateDate = new javax.swing.JLabel();
        lblSave = new javax.swing.JButton();
        txtAvail = new javax.swing.JTextField();
        lblCreateCar = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        lblManufacturer.setText("Manufacturer :");

        lblModelNumber.setText("Model Number :");

        lblManufactureYear.setText("Manufacture Year :");

        lblSeatsNumber.setText("Seats Number :");

        lblSerialNo.setText("Serial No :");

        lblCity.setText("City :");

        lblAvailability.setText("Availability :");

        lblMaintainanceCertificateDate.setText("Maintainance Certificate Date :");

        lblSave.setText("Save");
        lblSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSaveActionPerformed(evt);
            }
        });

        lblCreateCar.setText("CREATE CAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMaintainanceCertificateDate)
                            .addComponent(lblSerialNo)
                            .addComponent(lblSeatsNumber)
                            .addComponent(lblCity)
                            .addComponent(lblAvailability)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblManufactureYear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManufacturer)
                            .addComponent(lblModelNumber))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaintainanceCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtManufacturer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addComponent(txtModelNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtManufatctureYear, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSeatsNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSerialNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAvail, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(lblSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(lblCreateCar)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblManufacturer)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManufatctureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManufactureYear))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeatsNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSerialNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity))
                        .addGap(18, 18, 18)
                        .addComponent(lblAvailability))
                    .addComponent(txtAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaintainanceCertificateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaintainanceCertificateDate))
                .addGap(27, 27, 27)
                .addComponent(lblSave)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSaveActionPerformed
       
        try {
            
           /* 
            Properties carProp = new Properties();
            String propertyFileName = "config.properties";
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(propertyFileName);
            
            carProp.load(inputStream);
            */
            
            for(Car car1: cars1){
                
                if(car1.getSerialNumber() == Integer.parseInt(txtSerialNo.getText())){
                JOptionPane.showMessageDialog(this, "This Car already exists");
                    return;
                }
            }
            
            
            int manufactureYear = 0;
            int seatsNumber = 0;
            int serialNumber =0;
            int modelNumber=0;
            String city = txtCity.getText();
            boolean availability;
            String manufacturer = txtManufacturer.getText();
            
            
            
            
            
            FileReader reader = new FileReader("./config.properties");
            Properties carProp = new Properties();
            carProp.load(reader);
            
            
            try{    
                seatsNumber = Integer.parseInt(txtSeatsNumber.getText());
                serialNumber = Integer.parseInt(txtSerialNo.getText());
                manufactureYear = Integer.parseInt(txtManufatctureYear.getText());
                modelNumber = Integer.parseInt(txtModelNumber.getText());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Provide correct int value of SeatNumber, SerialNo, ManufactureYear and Model Number");
            }
            
            if (manufactureYear < 2019 || manufactureYear > 2021 || serialNumber < 5) {
                    JOptionPane.showMessageDialog(this, "Serial number should be greater than 3 digits And Manufacture year should be from 2019,2020,2021!!");
                    return;
                }
             if (modelNumber < 100 || modelNumber > 102) {
                    JOptionPane.showMessageDialog(this, "Model number should be 100, 101 or 102");
                    return;
                }
            
              if (seatsNumber < 1 || seatsNumber > 4) {
                    JOptionPane.showMessageDialog(this, "Seat number should be 1, 2, 3 or 4");
                    return;
                }
             
            if (!(city.equals("Boston") || city.equals("Erie") || city.equals("New York") || city.equals("New Jersey"))) {
                    JOptionPane.showMessageDialog(this, "Enter City as one of following: Boston, Erie, New York, New Jersey");
                    return;
                }
            
            if (!(manufacturer.equals("Toyota") || manufacturer.equals("GM") || manufacturer.equals("Audi") || manufacturer.equals("Jeep"))) {
                    JOptionPane.showMessageDialog(this, "Enter Manufacturer as one of following: Toyota, GM, Audi, Jeep");
                    return;
                }
            
            
            if(!(txtAvail.getText().equals("A") || txtAvail.getText().equals("NA"))){
                JOptionPane.showMessageDialog(this, "Availability should be A for 'Available' and NA for 'Not Available'");
                    return;
            }
            
            if(txtAvail.getText().equals("A")){
                availability = true;
            }
            else{
                availability = false;
            }
            
            Date date;
                try{   
                    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    formatter.setLenient(false);
                    String dateInString = txtMaintainanceCertificateDate.getText();
                    date = formatter.parse(dateInString);
                    String year = dateInString.split("/")[2];
                    if (year.length()!=4){
                    throw new Exception("Year should nbe 4 digit long");
                    }        
                    
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Provide correct value of Maintainance Certificate Date in dd/MM/yyyy format");
                return;
            }
            
            Car car = cars.addNewcar();
            
            Date dateNow = new Date();
            
            
            
            car.setMaintainanceCertificateDate(date);
            car.setCity(city);
            car.setAvailability(availability);
            car.setManufactureYear(manufactureYear);
            car.setManufacturer(manufacturer);
            car.setModelNumber(modelNumber);
            car.setSeatsNumber(seatsNumber);
            car.setSerialNumber(serialNumber);
            
            car.setEngineNo(carProp.getProperty("engineNo"));
            car.setOwnerEmailAddresses(carProp.getProperty("emailAddress"));
            car.setColor(carProp.getProperty("color"));
            car.setLicensePlates(Integer.parseInt(carProp.getProperty("licensePlates")));
            car.setOwnerAddress(carProp.getProperty("ownerAddress"));
            car.setOwnerDriverLicense((Integer.parseInt(carProp.getProperty("ownerDriverLicense"))));
            car.setOwnerName(carProp.getProperty("ownerName"));
            car.setOwnerSocialSecurityNumber((Integer.parseInt(carProp.getProperty("ownerSocialSecurityNumber"))));
            car.setOwnerTelephoneNumbers(Long.parseLong(carProp.getProperty("telephonenumber")));
            car.setWarrantyYear(Integer.parseInt(carProp.getProperty("warrantyyear")));
            car.setLastUpdateOrCreate(dateNow);
            JOptionPane.showMessageDialog(null, "Car added!", "Info", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreateCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCreateCar;
    private javax.swing.JLabel lblMaintainanceCertificateDate;
    private javax.swing.JLabel lblManufactureYear;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JButton lblSave;
    private javax.swing.JLabel lblSeatsNumber;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMaintainanceCertificateDate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtManufatctureYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeatsNumber;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables
}
