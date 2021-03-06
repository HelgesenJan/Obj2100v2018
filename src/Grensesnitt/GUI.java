package Grensesnitt;

import Kontroll.*;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.Iterator;
import java.text.ParseException;

import static javax.swing.JOptionPane.*;

public class GUI extends javax.swing.JFrame {
    private static Kontroll kontroll = null;

    private Kino _KINO = null;
    private Billett _BILLETT = null;
    private Visning _VISNING = null;

    private Loginn loginnType;


    public GUI() {
        initComponents();
    }

    /**
     * Generert GUI kode fra Netbeans
     */

    private void initComponents() {

        ticketReservation = new javax.swing.JDialog();
        reserveDropdownSeat = new javax.swing.JComboBox<>();
        commitReserveTicketOrder = new javax.swing.JButton();
        reserveAddSeat = new javax.swing.JButton();
        fieldReserveTicketPrice = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        reserveMovieTable = new javax.swing.JTable();
        reserveRemoveSeat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reserveTicketTable = new javax.swing.JTable();
        fieldReservePriceSum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dropdownSort = new javax.swing.JComboBox<>();
        closeTicketReservation = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cinemaChoice = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        login = new javax.swing.JDialog();
        commitLogin = new javax.swing.JButton();
        fieldUsername = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginClose = new javax.swing.JButton();
        cinemaStaff = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffMovieTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        staffDropdownSeat = new javax.swing.JComboBox<>();
        staffAddPlacement = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        staffAddPlacementTable = new javax.swing.JTable();
        staffConfirmPlacement = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        staffPriceAmount = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        staffInsertTicketCode = new javax.swing.JTextField();
        staffConfirmPayment = new javax.swing.JButton();
        removeChosenTicket = new javax.swing.JButton();
        staffClose = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        staffRemovePlacement = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        staffCinemaChoice = new javax.swing.JComboBox<>();
        statistics = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        reportMovieTable = new javax.swing.JTable();
        reportClose = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        reportStatisticsTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        reportCinemaTheater = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        reportPercentTable = new javax.swing.JTable();
        confirmation = new javax.swing.JDialog();
        ticketCodeTxt = new javax.swing.JTextField();
        seatCountTxt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        seatsTxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        confirmConfirmWindow = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cancelConfirmationWindow = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        dateTxt = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        timeTxt = new javax.swing.JTextField();
        confirmWindowClose = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        adminSettings = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        adminMovieTable = new javax.swing.JTable();
        adminCinemaDropdown = new javax.swing.JComboBox<>();
        adminHeader = new javax.swing.JLabel();
        adminEditMovie = new javax.swing.JButton();
        newMovie = new javax.swing.JLabel();
        theaterLabel = new javax.swing.JLabel();
        adminClose = new javax.swing.JButton();
        movieLabel = new javax.swing.JLabel();
        adminTheaterDropdown = new javax.swing.JComboBox<>();
        adminMovieTxt = new javax.swing.JTextField();
        adminAdd = new javax.swing.JButton();
        adminAddMovie = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        newShowing = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        adminTitleDropdown = new javax.swing.JComboBox<>();
        adminPriceTxt = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        editLabel = new javax.swing.JLabel();
        cinemaLabel = new javax.swing.JLabel();
        adminDisplayDate = new javax.swing.JTextField();
        adminDisplayClock = new javax.swing.JTextField();
        newMovie1 = new javax.swing.JLabel();
        adminChangeMovieName = new javax.swing.JButton();
        adminChangeNameList = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        adminPlanner = new javax.swing.JDialog();
        planningHeader = new javax.swing.JLabel();
        adminButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        planningClose = new javax.swing.JButton();
        adminChangeDisplayWindow = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        changeDisplayID = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        changeDisplayMovie = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        changeDisplayTheatre = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        changeDisplayDate = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        changeDisplayTime = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        changeDisplayConfirm = new javax.swing.JButton();
        changeDisplayClose = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        openTicketReservation = new javax.swing.JButton();
        openAdmin = new javax.swing.JButton();
        openAttendant = new javax.swing.JButton();
        header = new javax.swing.JLabel();

        //staffCinemaChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        staffCinemaChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffCinemaChoiceActionPerformed(evt);
            }
        });

        //reserveDropdownSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        reserveDropdownSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        commitReserveTicketOrder.setText("Bestill");
        commitReserveTicketOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitReserveTicketOrderActionPerformed(evt);
            }
        });

        reserveAddSeat.setText("Legg til");
        reserveAddSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveAddSeatActionPerformed(evt);
            }
        });

        fieldReserveTicketPrice.setEditable(false);
        fieldReserveTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });



        reserveMovieTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Film", "Tid", "Sal", "Pris","#"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reserveMovieTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(reserveMovieTable);
        if (reserveMovieTable.getColumnModel().getColumnCount() > 0) {
            reserveMovieTable.getColumnModel().getColumn(0).setResizable(false);
            reserveMovieTable.getColumnModel().getColumn(1).setResizable(false);
            reserveMovieTable.getColumnModel().getColumn(2).setResizable(false);
        }

        reserveRemoveSeat.setText("Nullstill");
        reserveRemoveSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveRemoveSeatActionPerformed(evt);
            }
        });

        jLabel7.setText("Pris per billett:");

        reserveTicketTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Rad", "Sete", "#"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reserveTicketTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(reserveTicketTable);
        if (reserveTicketTable.getColumnModel().getColumnCount() > 0) {
            reserveTicketTable.getColumnModel().getColumn(0).setResizable(false);
            reserveTicketTable.getColumnModel().getColumn(1).setResizable(false);
            reserveTicketTable.getColumnModel().getColumn(2).setResizable(false);
        }

        fieldReservePriceSum.setEditable(false);
        fieldReservePriceSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel10.setText("Sum:");

        jLabel13.setText("Sete:");

        dropdownSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alfabetisk", "Tidspunkt" }));
        dropdownSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownSortActionPerformed(evt);
            }
        });

        closeTicketReservation.setText("Lukk");
        closeTicketReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeTicketReservationActionPerformed(evt);
            }
        });

        jLabel22.setText("Velg kino:");

        //cinemaChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cinemaChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinemaChoiceActionPerformed(evt);
            }
        });

        reserveMovieTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) {
                    reserveMovieTableSelected(e);
                }
            }
        });

        adminMovieTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) {
                    adminMovieTableSelected(e);
                }
            }
        });

        jLabel33.setText("Sortering:");

        javax.swing.GroupLayout ticketReservationLayout = new javax.swing.GroupLayout(ticketReservation.getContentPane());
        ticketReservation.getContentPane().setLayout(ticketReservationLayout);
        ticketReservationLayout.setHorizontalGroup(
                ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                .addContainerGap(823, Short.MAX_VALUE)
                                                .addComponent(closeTicketReservation))
                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel13)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(reserveDropdownSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(reserveAddSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(17, 17, 17))
                                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(reserveRemoveSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                                .addComponent(jLabel7)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(fieldReserveTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                                .addGap(53, 53, 53)
                                                                .addComponent(jLabel10)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(fieldReservePriceSum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(commitReserveTicketOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(40, 40, 40))
                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(cinemaChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                .addComponent(jLabel33)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                .addComponent(dropdownSort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(486, 486, 486))))
                        .addComponent(jSeparator6)
        );
        ticketReservationLayout.setVerticalGroup(
                ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel33))
                                .addGap(3, 3, 3)
                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cinemaChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(reserveDropdownSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(reserveAddSeat)
                                                .addComponent(jLabel13))
                                        .addComponent(dropdownSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                                                .addGap(4, 4, 4)
                                                                                .addComponent(jLabel7))
                                                                        .addComponent(fieldReserveTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(ticketReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(fieldReservePriceSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(commitReserveTicketOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(21, 21, 21)
                                                .addComponent(closeTicketReservation))
                                        .addGroup(ticketReservationLayout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(reserveRemoveSeat)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        login.setTitle("Pålogging");

        commitLogin.setText("Logg på");
        commitLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitLoginActionPerformed(evt);
            }
        });

        fieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Logg inn");

        jLabel3.setText("Brukernavn:");

        jLabel4.setText("Passord:");

        loginClose.setText("Lukk");
        loginClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login.getContentPane());
        login.getContentPane().setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
                loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginLayout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel4)
                                                                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(loginLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(loginLayout.createSequentialGroup()
                                                                        .addComponent(commitLogin)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(loginClose))
                                                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel2)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
                loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(commitLogin)
                                        .addComponent(loginClose))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        cinemaStaff.setTitle("cinemaStaff");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Kinobetjent");

        staffMovieTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Film", "Sal", "Tid"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        staffMovieTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) {
                    staffMovieTableSelected(e);
                }
            }
        });

        staffMovieTable.setSurrendersFocusOnKeystroke(true);
        staffMovieTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(staffMovieTable);
        if (staffMovieTable.getColumnModel().getColumnCount() > 0) {
            staffMovieTable.getColumnModel().getColumn(0).setResizable(false);
            staffMovieTable.getColumnModel().getColumn(1).setResizable(false);
            staffMovieTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel5.setText("Velg film");

        jLabel6.setText("Direkte bestilling");

        jLabel14.setText("Sete:");

        //staffDropdownSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        staffDropdownSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        staffAddPlacement.setText("Legg til");
        staffAddPlacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffAddPlacementActionPerformed(evt);
            }
        });

        staffAddPlacementTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "#", "Rad", "Sete"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        staffAddPlacementTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(staffAddPlacementTable);
        if (staffAddPlacementTable.getColumnModel().getColumnCount() > 0) {
            staffAddPlacementTable.getColumnModel().getColumn(0).setResizable(false);
            staffAddPlacementTable.getColumnModel().getColumn(1).setResizable(false);
            staffAddPlacementTable.getColumnModel().getColumn(2).setResizable(false);
        }

        staffConfirmPlacement.setText("Bekreft");
        staffConfirmPlacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffConfirmPlacementActionPerformed(evt);
            }
        });

        jLabel15.setText("Sum:");

        staffPriceAmount.setEditable(false);
        staffPriceAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel16.setText("Bekreft en reservasjon med billettkode");
        jLabel8.setText("Velg kino:");
        staffInsertTicketCode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        staffInsertTicketCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        staffConfirmPayment.setText("Bekreft betaling");
        staffConfirmPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffConfirmPaymentActionPerformed(evt);
            }
        });

        removeChosenTicket.setText("Fjern ubetalte billetter ");
        removeChosenTicket.setToolTipText("");
        removeChosenTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeChosenTicketActionPerformed(evt);
            }
        });

        staffClose.setText("Lukk");
        staffClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffCloseActionPerformed(evt);
            }
        });

        staffRemovePlacement.setText("Nullstill");
        staffRemovePlacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRemovePlacementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cinemaStaffLayout = new javax.swing.GroupLayout(cinemaStaff.getContentPane());
        cinemaStaff.getContentPane().setLayout(cinemaStaffLayout);
        cinemaStaffLayout.setHorizontalGroup(
                cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5)
                                .addGap(506, 506, 506)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(576, 576, 576)
                                .addComponent(jLabel14)
                                .addGap(5, 5, 5)
                                .addComponent(staffDropdownSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(staffAddPlacement))
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(7, 7, 7)
                                                .addComponent(staffPriceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addComponent(staffRemovePlacement))
                                        .addComponent(staffConfirmPlacement))
                                .addGap(18, 18, 18)
                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(staffInsertTicketCode, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(staffConfirmPayment))))
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(removeChosenTicket)
                                .addGap(788, 788, 788)
                                .addComponent(staffClose))
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(staffCinemaChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(393, 393, 393)
                                                .addComponent(jLabel14)
                                                .addGap(5, 5, 5)
                                                .addComponent(staffDropdownSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(staffAddPlacement))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        cinemaStaffLayout.setVerticalGroup(
                cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel16))))
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel8)
                                                        .addComponent(staffCinemaChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(staffDropdownSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(staffAddPlacement))
                                .addGap(7, 7, 7)
                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9)
                                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel15))
                                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(staffPriceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(staffRemovePlacement))
                                                .addGap(11, 11, 11)
                                                .addComponent(staffConfirmPlacement))
                                        .addGroup(cinemaStaffLayout.createSequentialGroup()
                                                .addComponent(staffInsertTicketCode, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(staffConfirmPayment)))
                                .addGap(21, 21, 21)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(cinemaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(removeChosenTicket)
                                        .addComponent(staffClose)))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel17.setText("Rapport");

        jLabel18.setText("Statistikk for hver film");

        reportMovieTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String [] {
                        "Film"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportMovieTable.getTableHeader().setReorderingAllowed(false);
        reportMovieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMovieTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(reportMovieTable);
        if (reportMovieTable.getColumnModel().getColumnCount() > 0) {
            reportMovieTable.getColumnModel().getColumn(0).setResizable(false);
        }

        reportClose.setText("Lukk");
        reportClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        reportClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportCloseActionPerformed(evt);
            }
        });

        jLabel19.setText("Velg en film");

        reportStatisticsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Billetter/plasser", "% av kapasitet", "Ikke betalt", "Visningsdato"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportStatisticsTable.getTableHeader().setReorderingAllowed(false);
        reportStatisticsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        jScrollPane6.setViewportView(reportStatisticsTable);
        if (reportStatisticsTable.getColumnModel().getColumnCount() > 0) {
            reportStatisticsTable.getColumnModel().getColumn(0).setResizable(false);
            reportStatisticsTable.getColumnModel().getColumn(1).setResizable(false);
            reportStatisticsTable.getColumnModel().getColumn(2).setResizable(false);
            reportStatisticsTable.getColumnModel().getColumn(3).setResizable(false);
        }



        jLabel20.setText("Popularitet av kinosal");

        jLabel21.setText("Velg kinosal");

        reportCinemaTheater.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String [] {
                        "Kinosal"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportCinemaTheater.getTableHeader().setReorderingAllowed(false);
        reportCinemaTheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportCinemaTheaterMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(reportCinemaTheater);
        if (reportCinemaTheater.getColumnModel().getColumnCount() > 0) {
            reportCinemaTheater.getColumnModel().getColumn(0).setResizable(false);
        }

        reportPercentTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Film", "Gjennomsnitt %"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportPercentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(reportPercentTable);
        if (reportPercentTable.getColumnModel().getColumnCount() > 0) {
            reportPercentTable.getColumnModel().getColumn(0).setResizable(false);
            reportPercentTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout statisticsLayout = new javax.swing.GroupLayout(statistics.getContentPane());
        statistics.getContentPane().setLayout(statisticsLayout);
        statisticsLayout.setHorizontalGroup(
                statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(statisticsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(9, 9, 9)
                                                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel19))
                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                                                                .addGap(195, 195, 195)
                                                                                                .addComponent(reportClose))
                                                                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel17)
                                                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel20)
                                                .addGap(276, 276, 276))))
        );
        statisticsLayout.setVerticalGroup(
                statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)
                                .addGap(20, 20, 20)
                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel21))
                                                .addGap(18, 18, 18)
                                                .addGroup(statisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(reportClose)
                                                .addGap(14, 14, 14))
                                        .addGroup(statisticsLayout.createSequentialGroup()
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(43, Short.MAX_VALUE))))
        );

        ticketCodeTxt.setEditable(false);
        ticketCodeTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ticketCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        seatCountTxt.setEditable(false);
        seatCountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel23.setText("Vis denne i skranken 30 minutter før visningstart");

        totalTxt.setEditable(false);
        totalTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel24.setText("Film");

        titleTxt.setEditable(false);
        titleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel25.setText("Plass");

        jLabel26.setText("Antall plasser");

        seatsTxt.setEditable(false);
        seatsTxt.setVisible(false);
        jLabel25.setVisible(false);
        seatsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel27.setText("Dato");

        confirmConfirmWindow.setText("Bekreft");
        confirmConfirmWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmConfirmWindowActionPerformed(evt);
            }
        });

        jLabel28.setText("Tidspunkt");

        cancelConfirmationWindow.setText("Avbryt");
        cancelConfirmationWindow.setToolTipText("");
        cancelConfirmationWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelConfirmationWindowActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Sum");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Bekreft billettbestilling");

        dateTxt.setEditable(false);
        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Din billettkode");

        timeTxt.setEditable(false);
        timeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        confirmWindowClose.setText("Lukk");
        confirmWindowClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmWindowCloseActionPerformed(evt);
            }
        });

        jLabel32.setText("Ta vare på koden før du lukker");

        javax.swing.GroupLayout confirmationLayout = new javax.swing.GroupLayout(confirmation.getContentPane());
        confirmation.getContentPane().setLayout(confirmationLayout);
        confirmationLayout.setHorizontalGroup(
                confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(confirmationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(confirmationLayout.createSequentialGroup()
                                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel25)
                                                        .addComponent(jLabel26))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(confirmationLayout.createSequentialGroup()
                                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel24)
                                                        .addComponent(jLabel27)
                                                        .addComponent(jLabel28))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dateTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(titleTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(timeTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(seatCountTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(seatsTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(totalTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ticketCodeTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(confirmConfirmWindow, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmationLayout.createSequentialGroup()
                                                .addGap(0, 8, Short.MAX_VALUE)
                                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jSeparator4)
                                                                .addComponent(cancelConfirmationWindow)
                                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel31)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmationLayout.createSequentialGroup()
                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                        .addComponent(jLabel29)
                                                                        .addGap(198, 198, 198)))
                                                        .addComponent(jLabel23))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmationLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel32)
                                                .addGap(18, 18, 18)
                                                .addComponent(confirmWindowClose)
                                                .addGap(17, 17, 17))))
        );
        confirmationLayout.setVerticalGroup(
                confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(confirmationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel28)
                                        .addComponent(timeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(seatCountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(seatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29))
                                .addGap(18, 18, 18)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelConfirmationWindow)
                                        .addComponent(confirmConfirmWindow))
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31)
                                        .addComponent(ticketCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(confirmationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirmWindowClose)
                                        .addComponent(jLabel32))
                                .addGap(17, 17, 17))
        );

        adminMovieTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Kino", "Film", "Sal", "Dato", "Pris"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminMovieTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(adminMovieTable);
        if (adminMovieTable.getColumnModel().getColumnCount() > 0) {
            adminMovieTable.getColumnModel().getColumn(0).setResizable(false);
            adminMovieTable.getColumnModel().getColumn(1).setResizable(false);
            adminMovieTable.getColumnModel().getColumn(2).setResizable(false);
            adminMovieTable.getColumnModel().getColumn(3).setResizable(false);
            adminMovieTable.getColumnModel().getColumn(4).setResizable(false);
        }

       // adminCinemaDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        adminCinemaDropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                adminCinemaDropdownItemStateChanged(evt);
            }
        });

        adminHeader.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        adminHeader.setText("Administrasjon");

        adminEditMovie.setText("Endre");
        adminEditMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEditMovieActionPerformed(evt);
            }
        });

        newMovie.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        newMovie.setText("Legg til film");

        theaterLabel.setText("Sal");

        adminClose.setText("Lukk");
        adminClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCloseActionPerformed(evt);
            }
        });

        movieLabel.setText("Tittel");

        //adminTheaterDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        adminTheaterDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        adminMovieTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        adminAdd.setText("Legg til");
        adminAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddActionPerformed(evt);
            }
        });

        adminAddMovie.setText("Legg til");
        adminAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddMovieActionPerformed(evt);
            }
        });

        timeLabel.setText("Klokkeslett");

        newShowing.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        newShowing.setText("Legg til visning");

        titleLabel.setText("Film");

        priceLabel.setText("Pris");

        //adminTitleDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        adminTitleDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        adminPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        dateLabel.setText("Dato");

        editLabel.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        editLabel.setText("Endre visning");

        cinemaLabel.setText("Kino");

        newMovie1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        newMovie1.setText("Endre filmnavn");

        adminChangeMovieName.setText("Endre");
        adminChangeMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminChangeMovieNameActionPerformed(evt);
            }
        });

        adminChangeNameList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
            }
        });
        adminChangeNameList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        jLabel11.setText("YYYY-MM-DD");

        jLabel34.setText("HH:MM");

        javax.swing.GroupLayout adminSettingsLayout = new javax.swing.GroupLayout(adminSettings.getContentPane());
        adminSettings.getContentPane().setLayout(adminSettingsLayout);
        adminSettingsLayout.setHorizontalGroup(
                adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminSettingsLayout.createSequentialGroup()
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminSettingsLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(adminClose))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                                .addComponent(editLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jScrollPane9)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminSettingsLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(adminEditMovie)))
                                .addContainerGap())
                        .addComponent(jSeparator8)
                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(adminHeader))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(newShowing))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(cinemaLabel)
                                                .addGap(169, 169, 169)
                                                .addComponent(theaterLabel)
                                                .addGap(144, 144, 144)
                                                .addComponent(priceLabel))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(adminCinemaDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(adminTheaterDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(adminPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(adminTitleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(titleLabel))
                                                .addGap(12, 12, 12)
                                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(125, 125, 125)
                                                .addComponent(timeLabel))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(newMovie)
                                                        .addComponent(movieLabel)
                                                        .addComponent(adminMovieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(adminAddMovie))
                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                                .addGap(34, 34, 34)
                                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(newMovie1)
                                                                        .addComponent(adminChangeMovieName)))
                                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(adminChangeNameList, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(217, 217, 217)
                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(adminAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(adminDisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel11))
                                                                .addGap(12, 12, 12)
                                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel34)
                                                                        .addComponent(adminDisplayClock, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jSeparator9)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminSettingsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        adminSettingsLayout.setVerticalGroup(
                adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(adminHeader)
                                .addGap(26, 26, 26)
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(newMovie)
                                        .addComponent(newMovie1))
                                .addGap(13, 13, 13)
                                .addComponent(movieLabel)
                                .addGap(13, 13, 13)
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(adminMovieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminChangeNameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(adminAddMovie)
                                        .addComponent(adminChangeMovieName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(newShowing)
                                .addGap(15, 15, 15)
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(cinemaLabel))
                                        .addComponent(theaterLabel)
                                        .addComponent(priceLabel))
                                .addGap(7, 7, 7)
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adminCinemaDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminTheaterDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dateLabel)
                                                        .addComponent(timeLabel)))
                                        .addGroup(adminSettingsLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(titleLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adminTitleDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminDisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminDisplayClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel34))
                                .addGap(14, 14, 14)
                                .addComponent(adminAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminEditMovie)
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(adminClose)
                                .addContainerGap())
        );
        planningHeader.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        planningHeader.setText("Planleggingsadministrator");

        adminButton.setText("Administrasjon");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        reportButton.setText("Rapportering");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        planningClose.setText("Lukk");
        planningClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planningCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPlannerLayout = new javax.swing.GroupLayout(adminPlanner.getContentPane());
        adminPlanner.getContentPane().setLayout(adminPlannerLayout);
        adminPlannerLayout.setHorizontalGroup(
                adminPlannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminPlannerLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(adminPlannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(planningClose)
                                        .addGroup(adminPlannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(planningHeader)
                                                .addGroup(adminPlannerLayout.createSequentialGroup()
                                                        .addComponent(adminButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(reportButton))))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        adminPlannerLayout.setVerticalGroup(
                adminPlannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminPlannerLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(planningHeader)
                                .addGap(18, 18, 18)
                                .addGroup(adminPlannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(adminButton)
                                        .addComponent(reportButton))
                                .addGap(18, 18, 18)
                                .addComponent(planningClose)
                                .addContainerGap(30, Short.MAX_VALUE))
        );


        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Endre visning");

        jLabel12.setText("Visningsnr:");

        changeDisplayID.setEditable(false);

        jLabel35.setText("Film:");

        jLabel36.setText("Sal:");

        jLabel37.setText("Dato:");

        jLabel38.setText("Klokkeslett:");

        jLabel39.setText("Pris:");

        changeDisplayConfirm.setText("Endre");
        changeDisplayConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDisplayConfirmActionPerformed(evt);
            }
        });

        changeDisplayClose.setText("Lukk");
        changeDisplayClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDisplayCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminChangeDisplayWindowLayout = new javax.swing.GroupLayout(adminChangeDisplayWindow.getContentPane());
        adminChangeDisplayWindow.getContentPane().setLayout(adminChangeDisplayWindowLayout);
        adminChangeDisplayWindowLayout.setHorizontalGroup(
                adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminChangeDisplayWindowLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(adminChangeDisplayWindowLayout.createSequentialGroup()
                                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel9)
                                                        .addGroup(adminChangeDisplayWindowLayout.createSequentialGroup()
                                                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel12)
                                                                        .addComponent(jLabel35)
                                                                        .addComponent(jLabel36)
                                                                        .addComponent(jLabel37))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(changeDisplayID)
                                                                        .addComponent(changeDisplayMovie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(changeDisplayTheatre, 0, 158, Short.MAX_VALUE)
                                                                        .addComponent(changeDisplayDate)))
                                                        .addGroup(adminChangeDisplayWindowLayout.createSequentialGroup()
                                                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel38)
                                                                        .addComponent(jLabel39))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(changeDisplayTime)
                                                                        .addGroup(adminChangeDisplayWindowLayout.createSequentialGroup()
                                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 79, Short.MAX_VALUE)))))
                                                .addGap(0, 60, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminChangeDisplayWindowLayout.createSequentialGroup()
                                                .addComponent(changeDisplayClose)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(changeDisplayConfirm)))
                                .addContainerGap())
        );
        adminChangeDisplayWindowLayout.setVerticalGroup(
                adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(adminChangeDisplayWindowLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(changeDisplayID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(changeDisplayMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel36)
                                        .addComponent(changeDisplayTheatre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel37)
                                        .addComponent(changeDisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel38)
                                        .addComponent(changeDisplayTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel39)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(adminChangeDisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(changeDisplayConfirm)
                                        .addComponent(changeDisplayClose))
                                .addContainerGap())
        );


        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        exit.setText("Avslutt");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        openTicketReservation.setText("Billettbestilling");
        openTicketReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTicketReservationActionPerformed(evt);
            }
        });

        openAdmin.setText("Kinoadministrator");
        openAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        openAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAdminActionPerformed(evt);
            }
        });

        openAttendant.setText("Kinobetjent");
        openAttendant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        openAttendant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAttendantActionPerformed(evt);
            }
        });

        header.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        header.setText("Kinosentral");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(header)
                                                .addGap(46, 46, 46)
                                                .addComponent(openTicketReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(openAttendant, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(openAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(24, 24, 24)
                                                .addComponent(exit)))
                                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(header)
                                        .addComponent(openTicketReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(openAttendant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(openAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>

    /**
     * Kalles ved endring av navn på film.
     * @param evt
     */

    private void adminChangeMovieNameActionPerformed(ActionEvent evt) {
        String filmnavn = (String) adminChangeNameList.getSelectedItem();
        String nytt_filmnavn = JOptionPane.showInputDialog(adminSettings, "Oppgi nytt filmnavn",filmnavn);

        if(nytt_filmnavn != null && !filmnavn.equals(nytt_filmnavn)) {
            //Sjekk om nytt_filmavn er i bruk
            boolean film_finnes = false;
            for (Film film : kontroll.getFilmer()) {
                if (film.getFilmnavn().equals(nytt_filmnavn)) {
                    film_finnes = true;
                }
            }

            if (film_finnes) {
                JOptionPane.showMessageDialog(adminSettings, "Filmnavn er allerede i bruk!");
            } else {

                Film film = kontroll.finnFilm(filmnavn);

                if (film != null) {
                    film.setFilmnavn(nytt_filmnavn);
                    //Oppdater gui
                    hentFilmTitler();
                    fyllVisningerSomKanEndres();
                    JOptionPane.showMessageDialog(adminSettings, "Filmnavn endret.");
                } else {
                    JOptionPane.showMessageDialog(adminSettings, "Du må velge en film!");
                }
            }
        }
    }

    /**
     * Kalles når endrings tabell blir valgt
     * En _VISNING blir definert
     * @param e
     */

    private void adminMovieTableSelected(ListSelectionEvent e) {

        _VISNING = null;

        int visningsnr = -1;
        try {
            visningsnr = (int) adminMovieTable.getValueAt(adminMovieTable.getSelectedRow(), 5);
        }catch(Exception ex) {
            adminMovieTable.clearSelection();
        }

        //Fant en visning
        if(visningsnr != -1 && e != null) {
            System.out.println("Finn visning...");
            System.out.println(visningsnr);
            _VISNING = kontroll.finnVisning(visningsnr);
            System.out.println(_VISNING.toString());
        }
    }

    /**
     * Visnings tabellen i kinobetjenten blir valg
     * en _VISNIN blir funnet, og setevalg dropdown blir utfyllt.
     * en tom billett blir generert, her genereres også billettkoden
     * @param e
     */

    private void staffMovieTableSelected(ListSelectionEvent e) {

        staffDropdownSeat.removeAllItems();
        staffPriceAmount.setText("");
        staffConfirmPlacement.setEnabled(false);

        //Slett setevalg
        DefaultTableModel model = (DefaultTableModel) staffAddPlacementTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        int visningsnr = -1;
        try {
            visningsnr = (int) staffMovieTable.getValueAt(staffMovieTable.getSelectedRow(), 4);
        }catch(Exception ex) {
            //reserveMovieTable.clearSelection();
        }

        if(visningsnr != -1 && e != null) {

            System.out.println("Finn visning staff...");
            System.out.println(visningsnr);
            _VISNING  = kontroll.finnVisning(visningsnr);
            if(_VISNING != null) {
                _BILLETT = new Billett(kontroll.genererBillettkode(), _VISNING, true);

                //Try catch pga av mystisk exception
                try {
                    Iterator<Plass> itr = _VISNING.finnLedigePlasser().iterator();
                    while (itr.hasNext()) {
                        Plass plass = itr.next();
                        staffDropdownSeat.addItem(plass.getRadnr() + ", " + plass.getSetenr());
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    //staffMovieTableSelected(e);
                }
            }

        } else {
            staffMovieTable.clearSelection();
        }
    }

    /**
     * En kino blir valgt, oppdater tabellen i billettbestillingen
     * @param evt
     */
    private void staffCinemaChoiceActionPerformed(ActionEvent evt) {
        fyllFilmReservasjonsTabell(true);
    }

    /**
     * Visnings tabellen i bestillingsvinduet blir valgt
     * Billett blir generert
     * En visnings objekt blir hentet
     * Billettpris blir satt
     * @param e
     */

    public void reserveMovieTableSelected(ListSelectionEvent e) {

        commitReserveTicketOrder.setEnabled(false);

        _BILLETT = null;
        _VISNING = null;

        reserveDropdownSeat.removeAllItems();
        reserveTicketTable.removeAll();

        fieldReserveTicketPrice.setText("");
        fieldReservePriceSum.setText("");
        reserveTicketTable.removeAll();

        //Slett setevalg
        DefaultTableModel model = (DefaultTableModel) reserveTicketTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }


        int visningsnr = -1;
        try {
            visningsnr = (int) reserveMovieTable.getValueAt(reserveMovieTable.getSelectedRow(), 4);
        }catch(Exception ex) {
            reserveMovieTable.clearSelection();
        }

        if(visningsnr != -1 && e != null) {

            System.out.println("Finn visning...");
            System.out.println(visningsnr);
            _VISNING  = kontroll.finnVisning(visningsnr);
            _BILLETT = new Billett(kontroll.genererBillettkode(),_VISNING, false);

            //Sett pris...
            fieldReserveTicketPrice.setText(_VISNING.getPris() + "kr");

            //Try catch pga av mystisk exception
            try {
                Iterator<Plass> itr = _VISNING.finnLedigePlasser().iterator();
                while (itr.hasNext()) {
                    Plass plass = itr.next();
                    reserveDropdownSeat.addItem(plass.getRadnr() + ", " + plass.getSetenr());
                }
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
                //reserveMovieTableSelected(e);
            }

        } else {
            reserveMovieTable.clearSelection();
        }
    }

    /**
     * Ett sete blir lagt til i en bestilling
     * Plass objekt blir hentet ut og satt inn i en billett.
     * Total pris blir oppdatert.
     * @param evt
     */

    private void reserveAddSeatActionPerformed(ActionEvent evt) {

        String[] plass_str = reserveDropdownSeat.getSelectedItem().toString().split(",");

        //Slett sete i valg
        reserveDropdownSeat.removeItemAt(reserveDropdownSeat.getSelectedIndex());
        reserveDropdownSeat.setSelectedIndex(0);

        //Trim ut radnr og setenr
        int radnr = Integer.parseInt(plass_str[0].trim());
        int setenr = Integer.parseInt(plass_str[1].trim());

        //Legg til sete
        DefaultTableModel model = (DefaultTableModel) reserveTicketTable.getModel();
        model.addRow(new Object[]{radnr, setenr, model.getRowCount() +1});
        //Oppdater totalsum
        fieldReservePriceSum.setText(model.getRowCount() * _VISNING.getPris() + "kr");

        Plass plass = _VISNING.getKinosal().finnPlass(radnr,setenr);
        _BILLETT.leggTilPlass(plass);

        commitReserveTicketOrder.setEnabled(true);

    }

    /**
     * Dette er nullstillknappen,
     * Som rett og slett kjører reserveMovieTableSelected() og, ved at null blir satt så
     * blir billetten nullstilt.
     * @param evt
     */

    private void reserveRemoveSeatActionPerformed(ActionEvent evt) {
        reserveMovieTableSelected(null);
    }

    /**
     * Avslutt knapp er trykke,
     * se avslutt()
     * @param evt
     */

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        int svar = showConfirmDialog(this,
                "Vil du lagre data før du avslutter?",
                "Avbryt", YES_NO_OPTION);
        if (svar == YES_OPTION) {
            avslutt();
            setVisible(true);
        } else {
            setVisible(false);
            System.exit(0);
        }
    }

    /**
     * Vindu for kundens billettbestilling
     * @param evt
     */
    private void openTicketReservationActionPerformed(java.awt.event.ActionEvent evt) {
        ticketReservation.setVisible(true);
        ticketReservation.pack();
        fyllFilmReservasjonsTabell(false);
    }

    /**
     * Fyller ut visninger som kan endres i planleggings delen,
     * dvs. visninger som ikke har noen billetter knyttet til seg.
     */

    private void fyllVisningerSomKanEndres() {
        Object[][] tabellInnhold = kontroll.lagVisningerIkkeBestiltListe();
        Object[] kolonnenavn = {"Kino", "Film", "Sal", "Dato", "Pris","Visningsnr"};

        adminMovieTable.setModel(new DefaultTableModel(tabellInnhold, kolonnenavn));
    }

    /**
     * Metode som fyller ut visninger i bestillings delen/betjent delen
     * Dersom betjent er sann vil den fylle ut alle kommende visninger,
     * ikke bare de som går en halvtime før.
     * @param betjent
     */

    private void fyllFilmReservasjonsTabell(boolean betjent) {

        commitReserveTicketOrder.setEnabled(false);

        _KINO = null;
        if(betjent) {
            _KINO = kontroll.finnKino((String) staffCinemaChoice.getSelectedItem());
        } else {
            _KINO = kontroll.finnKino((String) cinemaChoice.getSelectedItem());
        }

        String sort = (String) dropdownSort.getSelectedItem();

        if(sort.equals("Alfabetisk")) {
            System.out.println("Alfabetisk");
            kontroll.sortering = Sortering.ALFABETISK;
        } else {
            System.out.println("Tid");
            kontroll.sortering = Sortering.TID;
        }

        System.out.println("betjent: " + betjent);
        Object[][] tabellInnhold = kontroll.lagVisningTabellListe(_KINO, betjent);

        Object[] kolonnenavn = {"Film", "Tid", "Sal", "Pris", "#"};

        if(betjent) {
            staffMovieTable.setModel(new DefaultTableModel(tabellInnhold, kolonnenavn));
            staffMovieTable.getColumnModel().getColumn(1).setPreferredWidth(120);
        } else {
            reserveMovieTable.setModel(new DefaultTableModel(tabellInnhold, kolonnenavn));
            reserveMovieTable.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

    }

    /**
     * Fyller ut tabellen med filmer for rapporter
     */

    private void fyllRapportTabell() {
        Object[][] tabellInnhold = kontroll.lagFilmTabellListe();
        Object[] kolonnenavn = {"Film"};
        reportMovieTable.setModel(new DefaultTableModel(tabellInnhold, kolonnenavn));
    }

    /**
     * Fyller ut tabellen visninger for rapporter
     * @param i
     */
    private void fyllRapportVisningsTabell(int i) {
        Object[][] tabellInnhold = kontroll.statistikkFilm(i);
        Object[] kolonnenavn = {"Billetter/plasser", "% av kapasitet", "Ikke betalt", "Visningsdato"};
        reportStatisticsTable.setModel(new DefaultTableModel(tabellInnhold, kolonnenavn));
        reportStatisticsTable.getColumnModel().getColumn(3).setPreferredWidth(110);

    }

    /**
     * Fyller ut tabellen for kinosaler
     */

    private void fyllKinosalTabell(){
        Object[][] tabellInnhold = kontroll.lagKinosalKinoTabellListe();
        Object[] kolonnenavn = {"Kinosal"};
        reportCinemaTheater.setModel(new DefaultTableModel(tabellInnhold, kolonnenavn));
    }

    /**
     * Fyller ut tabellen for kinosalsatistikk
     * @param i
     */

    private void fyllKinosalStatistikk(int i) {
        Object[][] tabellInnhold = kontroll.statistikkKinosal(i);
        Object[] kolonnenavn = {"Film", "Gjennomsnitt %"};
        reportPercentTable.setModel(new DefaultTableModel(tabellInnhold, kolonnenavn));
    }

    /**
     * Åpne admin vindu
     * @param evt
     */

    private void openAdminActionPerformed(java.awt.event.ActionEvent evt) {
        loginnType = Loginn.PLANLEGGER;
        login.setVisible(true);
        login.pack();
    }

    /**
     * Åpne kino betjent vindu
     * @param evt
     */

    private void openAttendantActionPerformed(java.awt.event.ActionEvent evt) {
        loginnType = Loginn.KINOBETJENT;
        login.setVisible(true);
        login.pack();
        fyllFilmReservasjonsTabell(true);
    }

    /**
     * Utfører login
     * @param evt
     */

    private void commitLoginActionPerformed(java.awt.event.ActionEvent evt) {
        innlogging();
    }

    /**
     * Legg til sete i billet for kinobetjenten
     * Plass objekt blir hentet ut fra kinosal
     * Plass blir lagt til i billettobjekt
     * Totalpris blir oppdatert.
     * @param evt
     */

    private void staffAddPlacementActionPerformed(java.awt.event.ActionEvent evt) {
        String[] plass_str = staffDropdownSeat.getSelectedItem().toString().split(",");

        //Slett sete i valg
        staffDropdownSeat.removeItemAt(staffDropdownSeat.getSelectedIndex());
        staffDropdownSeat.setSelectedIndex(0);

        //Trim ut radnr og setenr
        int radnr = Integer.parseInt(plass_str[0].trim());
        int setenr = Integer.parseInt(plass_str[1].trim());

        //Legg til sete
        DefaultTableModel model = (DefaultTableModel) staffAddPlacementTable.getModel();
        model.addRow(new Object[]{model.getRowCount() +1, radnr, setenr});
        //Oppdater totalsum
        staffPriceAmount.setText(model.getRowCount() * _VISNING.getPris() + "kr");

        Plass plass = _VISNING.getKinosal().finnPlass(radnr,setenr);
        _BILLETT.leggTilPlass(plass);

        staffConfirmPlacement.setEnabled(true);
    }

    /**
     * Fjern ubetalte billetter fra en visning, se fjernUbetalteBilletter i kontroll
     * @param evt
     */

    private void removeChosenTicketActionPerformed(java.awt.event.ActionEvent evt) {
        Visning visning = null;
        int visningsnr = -1;
        try {
            visningsnr = (int) staffMovieTable.getValueAt(staffMovieTable.getSelectedRow(), 4);

        }catch(ArrayIndexOutOfBoundsException ex) {
            reserveMovieTable.clearSelection();
        }
        if(visningsnr != -1) {
            visning = kontroll.finnVisning(visningsnr);
            JOptionPane.showMessageDialog(cinemaStaff, "Ubetalte billetter er fjernet!");
            if (visning != null) {

                try {
                    kontroll.fjernUbetalteBilletter(visning);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(cinemaStaff, "Klarte ikke å åpne slettinger.dat, sjekk skrive tilgang.");
                }
            } else {
                JOptionPane.showMessageDialog(cinemaStaff, "Velg en visning!");
            }
        }
    }

    /**
     * Dette kallet bekrefter en billetkode som kunde oppgir, og setter den til betalt.
     * @param evt
     */

    private void staffConfirmPaymentActionPerformed(java.awt.event.ActionEvent evt) {
        String billettkode = staffInsertTicketCode.getText().toUpperCase();

        Billett billett = kontroll.finnBillett(billettkode);
        if(billett != null && !billett.erBetalt()) {
            billett.setErBetalt(true);
            JOptionPane.showMessageDialog(cinemaStaff, "Billett " + billettkode + " er merket betalt!");
        } else if( billett != null && billett.erBetalt()) {
            JOptionPane.showMessageDialog(cinemaStaff, "Billett " + billettkode + " er allerede brukt!");
        } else {
            JOptionPane.showMessageDialog(cinemaStaff, "Ugyldig billettkode!");
        }
    }

    /**
     * Lukker kinobetjent vinduet.
     * @param evt
     */

    private void staffCloseActionPerformed(java.awt.event.ActionEvent evt) {
        cinemaStaff.setVisible(false);
    }

    /**
     * Viser bekreftelse vindu for billettbestilling i kinobetjent
     * nyBillett i kontroll blir kallet
     * @param evt
     */

    private void staffConfirmPlacementActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(cinemaStaff, "Total sum: " +  _VISNING.getPris() * _BILLETT.getPlasser().size() + ""
                                        +   "kr, Bilettkode: " + _BILLETT.getBillettkode()
                                        +   ", Film: " + _VISNING.getFilm().getFilmnavn()
                                        +   ", Sal: " + _VISNING.getKinosal().getKinosalnavn());
        kontroll.nyBillett(_BILLETT);
        staffMovieTableSelected(null);
    }

    /**
     * Åpne bekreftelse vindu for billettbestilling, og fyll ut felt.
     * I dette vinduet må kunde bekrefte billetten eller avbryte.
     * @param evt
     */

    private void commitReserveTicketOrderActionPerformed(java.awt.event.ActionEvent evt) {
        titleTxt.setText(_VISNING.getFilm().getFilmnavn());

        dateTxt.setText(_VISNING.getDagMnd());
        timeTxt.setText(_VISNING.getStartKlokkeslett());
        seatCountTxt.setText(reserveTicketTable.getRowCount() + "");

        String plasser  ="";
        for(Plass plass:_BILLETT.getPlasser()) {
            plasser += "Rad: " + plass.getRadnr() + ", Sete:" + plass.getSetenr() + " - ";
        }

        seatsTxt.setText(plasser);
        totalTxt.setText(reserveTicketTable.getRowCount() * _VISNING.getPris() + "kr");
        ticketCodeTxt.setText(_BILLETT.getBillettkode());

        //Vis vindu
        confirmWindowClose.setEnabled(false);
        confirmation.setVisible(true);
        confirmation.pack();
    }

    /**
     * Avslutt knapp blir trykket, spør om database skal bli lagret.
     * @param evt
     */

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        int svar = showConfirmDialog(GUI.this,
                "Vil du lagre data før du avslutter?",
                "Avbryt", YES_NO_OPTION);
        if (svar == YES_OPTION) {
            avslutt();
            setVisible(false);
            System.exit(0);
        } else {
            setVisible(false);
            System.exit(0);
        }
    }

    /**
     * Lukk billetbestilling
     * @param evt
     */

    private void closeTicketReservationActionPerformed(java.awt.event.ActionEvent evt) {
        ticketReservation.setVisible(false);
    }

    /**
     * Nullstillknapp for billet i kinobetjent
     * @param evt
     */

    private void staffRemovePlacementActionPerformed(java.awt.event.ActionEvent evt) {
        staffMovieTableSelected(null);
    }

    /**
     * Kalles når en film i rapporten blir trykket på, og fyller ut visnings statistikken.
     * @param evt
     */

    private void reportMovieTableMouseClicked(java.awt.event.MouseEvent evt) {

        try {
            int indeks = reportMovieTable.getSelectedRow();
            String film = reportMovieTable.getValueAt(indeks, 0).toString();
            for(int i = 0; i < kontroll.getFilmer().size(); i++){
                if(film == kontroll.getFilmer().get(i).getFilmnavn()){
                    fyllRapportVisningsTabell(i);
                }
            }
        } catch(Exception e) {
        }

    }

    /**
     * En kinosal i rapport blir valg, fyll ut kinosal statistikk.
     * @param evt
     */

    private void reportCinemaTheaterMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            int indeks = reportCinemaTheater.getSelectedRow();
            String kinoSal = reportCinemaTheater.getValueAt(indeks, 0).toString();
            String[] split = kinoSal.split(" - ");
            String sal = split[1];
            System.out.println(sal);

            for(int i=0; i<kontroll.getKinosaler().size(); i++) {
                if(kontroll.getKinosaler().get(i).getKinosalnavn().equals(sal)) {
                    fyllKinosalStatistikk(i);
                }
            }

        } catch (Exception e) {
        }
    }

    /**
     * Lukk rapport vindu
     * @param evt
     */

    private void reportCloseActionPerformed(java.awt.event.ActionEvent evt) {
        statistics.setVisible(false);
    }

    /**
     * Bekreft en billett fra billetbestilling og legg til i billeter.
     * @param evt
     */

    private void confirmConfirmWindowActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println(_BILLETT.toString());
        kontroll.nyBillett(_BILLETT);
        confirmConfirmWindow.setEnabled(false);
        confirmWindowClose.setEnabled(true);
    }

    /**
     * Lukk bekreft vindu
     * @param evt
     */

    private void cancelConfirmationWindowActionPerformed(java.awt.event.ActionEvent evt) {
        confirmation.setVisible(false);
    }

    /**
     * Kalles når en visning blir lagt til, se leggTilVisning()
     * @param evt
     */

    private void adminAddActionPerformed(java.awt.event.ActionEvent evt) {
            leggTilVisning();
            for(int i = 0; i < kontroll.getVisninger().size(); i++){
                System.out.println(kontroll.getVisninger().get(i).toString());
            }
            fyllVisningerSomKanEndres();

    }

    /**
     * Åpner admin-vinduet
     * @param evt
     */

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            _VISNING = null;
            adminSettings.setVisible(true);
            adminSettings.pack();
            hentFilmTitler();
            fyllVisningerSomKanEndres();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * Legg til en film, se opprettFilm()
     * @param evt
     */
    private void adminAddMovieActionPerformed(java.awt.event.ActionEvent evt) {
        opprettFilm();
        //Oppdater film liste
        hentFilmTitler();
    }

    /**
     * Rediger navn på en film, sørger for at alle dropdowns blir oppdatert.
     * @param evt
     */

    private void adminEditMovieActionPerformed(java.awt.event.ActionEvent evt) {

        //Fyll ut filmer
        changeDisplayMovie.removeAllItems();
        changeDisplayTheatre.removeAllItems();

       //Sjekk om visning er valgt
        if(_VISNING != null) {

            //Legg til filmer
            for(Film film:kontroll.getFilmer()) {
                changeDisplayMovie.addItem(film.getFilmnavn());
            }

            //Legg til kinosaler
            for(Kinosal sal: _VISNING.getKinosal().getKino().getKinosaler()) {
                changeDisplayTheatre.addItem(sal.getKinosalnavn());
            }

            changeDisplayID.setText(_VISNING.getVisningsNr() + "");
            changeDisplayMovie.setSelectedItem(_VISNING.getFilm().getFilmnavn());
            changeDisplayTheatre.setSelectedItem(_VISNING.getKinosal().getKinosalnavn());
            changeDisplayDate.setText(_VISNING.getDagMnd());
            changeDisplayTime.setText(_VISNING.getStartKlokkeslett());
            jTextField3.setText(_VISNING.getPris() + "");

            adminChangeDisplayWindow.setVisible(true);
            adminChangeDisplayWindow.pack();
        } else {
            JOptionPane.showMessageDialog(adminSettings, "Velg en visning fra tabellen ovenfor!");
        }
    }

    /**
     * Lukk admin vindu
     * @param evt
     */

    private void adminCloseActionPerformed(java.awt.event.ActionEvent evt) {
        adminSettings.setVisible(false);
    }

    /**
     * Åpne rapport vindu
     * @param evt
     */

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        statistics.setVisible(true);
        statistics.pack();
        fyllRapportTabell();
        fyllKinosalTabell();
    }

    /**
     * Åpne planlegger vindu/dashboard
     * @param evt
     */

    private void planningCloseActionPerformed(java.awt.event.ActionEvent evt) {
        adminPlanner.setVisible(false);
    }

    /**
     * Åpne billettbekreftelse, nullstill setevalg.
     * @param evt
     */

    private void confirmWindowCloseActionPerformed(java.awt.event.ActionEvent evt) {
        confirmation.setVisible(false);
        confirmConfirmWindow.setEnabled(true);
        reserveMovieTableSelected(null); //Nullstill setevalg
    }

    /**
     * Lukker login-vinduet
     * @param evt
     */

    private void loginCloseActionPerformed(java.awt.event.ActionEvent evt) {
        login.setVisible(false);
    }

    /**
     * Kalles når sortering blir valgt i bestillings GUIen
     * @param evt
     */

    private void dropdownSortActionPerformed(java.awt.event.ActionEvent evt) {
        fyllFilmReservasjonsTabell(false);
    }

    /**
     *Kalles nå kinovalg blir endret i bestillings GUI
     * @param evt
     */

    private void cinemaChoiceActionPerformed(java.awt.event.ActionEvent evt) {
        reserveMovieTable.clearSelection();
        fyllFilmReservasjonsTabell(false);
    }

    /**
     * Oppdaterer kinosal dropdown når kinoen blir endret
     * I administrator vindu
     * @param evt
     */

    private void adminCinemaDropdownItemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getSource() == adminCinemaDropdown){
            for (int i = 0; i < kontroll.getKinoer().size(); i++) {
                System.out.println(kontroll.getKinoer().get(i).getKinonavn());
                System.out.println(kontroll.getKinoer().get(i).getKinonavn());
                if (adminCinemaDropdown.getSelectedItem().equals(kontroll.getKinoer().get(i).getKinonavn())){
                    adminTheaterDropdown.removeAllItems();
                    for (int n = 0; n < kontroll.getKinoer().get(i).getKinosaler().size(); n++) {
                        System.out.println(kontroll.getKinoer().get(i).getKinosaler().get(n).getKinosalnavn());
                        adminTheaterDropdown.addItem(kontroll.getKinoer().get(i).getKinosaler().get(n).getKinosalnavn());
                    }

                }
            }
        }
    }

    /**
     * Kalles når en visning blir endret.
     * @param evt
     */

    private void changeDisplayConfirmActionPerformed(java.awt.event.ActionEvent evt) {


        //Endre visning
        Film gml_film = _VISNING.getFilm();
        Film ny_film = kontroll.finnFilm((String)changeDisplayMovie.getSelectedItem());

        Kinosal ny_sal = kontroll.finnSal(_VISNING.getKinosal().getKino().getKinonavn(),
                                        (String)changeDisplayTheatre.getSelectedItem());
        double ny_pris = Double.parseDouble(jTextField3.getText());
        Date ny_dato = null;
        try {
            ny_dato = kontroll.lagDato(changeDisplayDate.getText(), changeDisplayTime.getText());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(adminChangeDisplayWindow, "Ugyldig dato!");
            e.printStackTrace();
        }

        if(ny_dato != null) {


            _VISNING.setFilm(ny_film);
            _VISNING.setKinosal(ny_sal);
            _VISNING.setDato(ny_dato);
            _VISNING.setPris(ny_pris);

            ny_film.leggTilVisning(_VISNING);
            gml_film.fjernVisning(_VISNING);

            fyllVisningerSomKanEndres();
            adminChangeDisplayWindow.setVisible(false);
        }
    }

    /**
     * Lukk endre visning vindu
     * @param evt
     */

    private void changeDisplayCloseActionPerformed(java.awt.event.ActionEvent evt) {
        adminChangeDisplayWindow.setVisible(false);
    }

    /**
     * Metode for å hente kinoliste og kino-dropdown med den
     */

    public void hentKino() {
        for (int i = 0; i < kontroll.getKinoer().size(); i++) {
            System.out.println(kontroll.getKinoer().get(i));
            System.out.println(kontroll.getKinoer().get(i).getKinonavn());
            adminCinemaDropdown.addItem(kontroll.getKinoer().get(i).getKinonavn());
            cinemaChoice.addItem(kontroll.getKinoer().get(i).getKinonavn());
            staffCinemaChoice.addItem(kontroll.getKinoer().get(i).getKinonavn());
        }
    }

    /**
     * Henter filmtitler for bruk i planlegger vindu
     */

    public void hentFilmTitler(){
        adminTitleDropdown.removeAllItems();
        adminChangeNameList.removeAllItems();
        for(int i = 0; i < kontroll.getFilmer().size(); i++){
            adminTitleDropdown.addItem(kontroll.getFilmer().get(i).getFilmnavn());
            adminChangeNameList.addItem(kontroll.getFilmer().get(i).getFilmnavn());
        }
    }

    /**
     * Legg til en visning, henter ut data fra GUI og kaller nyVisning i kontroll
     */

    public void leggTilVisning() {
        Object sal = adminTheaterDropdown.getSelectedItem();
        String konvertertSal = String.valueOf(sal);
        Object kino = adminCinemaDropdown.getSelectedItem();
        String konvertertKino = String.valueOf(kino);
        Double pris = Double.parseDouble(adminPriceTxt.getText());
        Object tittel = adminTitleDropdown.getSelectedItem();
        String konvertertTittel = String.valueOf(tittel);
        String dato = adminDisplayDate.getText();
        String starttid = adminDisplayClock.getText();

        try {
            kontroll.nyVisning(konvertertKino, konvertertSal, pris, konvertertTittel, dato, starttid);
        } catch (ParseException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(adminSettings, "Du har oppgitt ugydlig dato/klokkeslett. Sjekk ");
        }

    }

    /**
     * Oppretter film, og kaller leggTilFilm i kontroll
     */

    public void opprettFilm() {
        int filmNr = kontroll.getFilmer().size();
        String filmNavn = adminMovieTxt.getText();
        boolean funnet = false;
        for (int i = 0; i < kontroll.getFilmer().size(); i++) {
            if (filmNavn.equals(kontroll.getFilmer().get(i).getFilmnavn())) {
                System.out.println("Filmen finnes fra før");
                funnet = true;
            }
        }
        if (funnet == false) {
            filmNr++;
            kontroll.leggTilFilm(filmNr, filmNavn);
            System.out.println(filmNr + ", " + filmNavn + " er lagt til");
        }
        System.out.println(kontroll.getFilmer());
    }

    /**
     * Utfører innloggingen
     * Sjekker om brukernavn og pin er riktig
     * Sjekker om bruker har tilgang til det den prøver å gå innpå
     */

    private void innlogging() {

        //Hent ut brukernavn og pin
        String brukernavn = fieldUsername.getText();
        String pin = fieldPassword.getText();

        //Sjekk om det er fyllt ut
        if(brukernavn.equals("") || pin.equals("")) {
            JOptionPane.showMessageDialog(login, "Du må fylle ut brukernavn og pin");
            return;
        }

        //Forsøk å hent ut bruker objekt
        Bruker bruker = kontroll.finnBruker(brukernavn);

        //Sjekk om brukernavn og pin er riktig
        if(bruker != null && bruker.riktigPin(pin)) {
            System.out.println("Riktig");
            switch (loginnType){
                case KINOBETJENT:
                    cinemaStaff.pack();
                    cinemaStaff.setVisible(true);
                    nullstillLogin();
                    break;
                case PLANLEGGER:
                    if(bruker.erPlanlegger()) {
                        adminPlanner.pack();
                        adminPlanner.setVisible(true);
                        nullstillLogin();
                    } else {
                        JOptionPane.showMessageDialog(login, "Du har ikke adgang til planleggingsdelen!");
                    }
                    break;
            }
        } else {
            //Skyldes feil pin eller feil brukernavn
            JOptionPane.showMessageDialog(login, "Feil brukernavn eller passord.");
        }
    }

    /**
     * Fjerner brukernavn og passord og gjør login usynlig
     * Denne kalles bare når brukeravn og passord er riktig
     */
    public void nullstillLogin() {
        fieldUsername.setText("");
        fieldPassword.setText("");
        login.setVisible(false);
    }

    /**
     * Kalles når avslutt knappen blir trykket på, eller 'X' blir trykket.
     */

    private void avslutt() {
        try {
            kontroll.lagreDatabase();
            System.out.println("Databasen er oppdatert!");
            System.exit(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Databasefeil:"+ e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Main metoden
     * @param args
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            kontroll =  Kontroll.getInstance();

            GUI gui = new GUI();
            gui.hentKino();
            gui.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Klarte ikke å koble til database: " + e.getMessage());
            System.exit(0);
        }

    }


    private javax.swing.JButton adminAdd;
    private javax.swing.JButton adminAddMovie;
    private javax.swing.JButton adminButton;
    private javax.swing.JDialog adminChangeDisplayWindow;
    private javax.swing.JButton adminChangeMovieName;
    private javax.swing.JComboBox<String> adminChangeNameList;
    private javax.swing.JComboBox<String> adminCinemaDropdown;
    private javax.swing.JButton adminClose;
    private javax.swing.JTextField adminDisplayClock;
    private javax.swing.JTextField adminDisplayDate;
    private javax.swing.JButton adminEditMovie;
    private javax.swing.JLabel adminHeader;
    private javax.swing.JTable adminMovieTable;
    private javax.swing.JTextField adminMovieTxt;
    private javax.swing.JDialog adminPlanner;
    private javax.swing.JTextField adminPriceTxt;
    private javax.swing.JDialog adminSettings;
    private javax.swing.JComboBox<String> adminTheaterDropdown;
    private javax.swing.JComboBox<String> adminTitleDropdown;
    private javax.swing.JButton cancelConfirmationWindow;
    private javax.swing.JButton changeDisplayClose;
    private javax.swing.JButton changeDisplayConfirm;
    private javax.swing.JTextField changeDisplayDate;
    private javax.swing.JTextField changeDisplayID;
    private javax.swing.JComboBox<String> changeDisplayMovie;
    private javax.swing.JComboBox<String> changeDisplayTheatre;
    private javax.swing.JTextField changeDisplayTime;
    private javax.swing.JComboBox<String> cinemaChoice;
    private javax.swing.JLabel cinemaLabel;
    private javax.swing.JDialog cinemaStaff;
    private javax.swing.JButton closeTicketReservation;
    private javax.swing.JButton commitLogin;
    private javax.swing.JButton commitReserveTicketOrder;
    private javax.swing.JButton confirmConfirmWindow;
    private javax.swing.JButton confirmWindowClose;
    private javax.swing.JDialog confirmation;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JComboBox<String> dropdownSort;
    private javax.swing.JLabel editLabel;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldReservePriceSum;
    private javax.swing.JTextField fieldReserveTicketPrice;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JDialog login;
    private javax.swing.JButton loginClose;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JLabel newMovie;
    private javax.swing.JLabel newMovie1;
    private javax.swing.JLabel newShowing;
    private javax.swing.JButton openAdmin;
    private javax.swing.JButton openAttendant;
    private javax.swing.JButton openTicketReservation;
    private javax.swing.JButton planningClose;
    private javax.swing.JLabel planningHeader;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton removeChosenTicket;
    private javax.swing.JButton reportButton;
    private javax.swing.JTable reportCinemaTheater;
    private javax.swing.JButton reportClose;
    private javax.swing.JTable reportMovieTable;
    private javax.swing.JTable reportPercentTable;
    private javax.swing.JTable reportStatisticsTable;
    private javax.swing.JButton reserveAddSeat;
    private javax.swing.JComboBox<String> reserveDropdownSeat;
    private javax.swing.JTable reserveMovieTable;
    private javax.swing.JButton reserveRemoveSeat;
    private javax.swing.JTable reserveTicketTable;
    private javax.swing.JTextField seatCountTxt;
    private javax.swing.JTextField seatsTxt;
    private javax.swing.JButton staffAddPlacement;
    private javax.swing.JTable staffAddPlacementTable;
    private javax.swing.JComboBox<String> staffCinemaChoice;
    private javax.swing.JButton staffClose;
    private javax.swing.JButton staffConfirmPayment;
    private javax.swing.JButton staffConfirmPlacement;
    private javax.swing.JComboBox<String> staffDropdownSeat;
    private javax.swing.JTextField staffInsertTicketCode;
    private javax.swing.JTable staffMovieTable;
    private javax.swing.JTextField staffPriceAmount;
    private javax.swing.JButton staffRemovePlacement;
    private javax.swing.JDialog statistics;
    private javax.swing.JLabel theaterLabel;
    private javax.swing.JTextField ticketCodeTxt;
    private javax.swing.JDialog ticketReservation;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField timeTxt;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JTextField totalTxt;
}
