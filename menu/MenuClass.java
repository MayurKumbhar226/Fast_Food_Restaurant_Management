import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuClass extends JFrame implements ActionListener
{
	JPanel leftP,upP,midP,sepP;
    int flag=0,amt=0;
	JLabel icon1,fast,res,menuhead;
    Font f;
    JButton menu,book,order,logout;
    JButton vegm,nonvegm,dessertm,drinksm;
    JButton vego,nonvego,desserto,drinkso,bill,add;
    JPanel orderp,bookp;
    JScrollPane jp;
    JLabel name,date,time,cont,totbill;
    JTextField tm,td,tt,tc,tb;
    JComboBox ord,qty;
    JLabel dish,q;
    JTextArea a;
    JScrollPane scr;
    JTable tbl,tbl2,tbl3,tbl4;
    JButton bookAdd,bookBook,bookDelete;
    JLabel bookName,bookEmail,bookPhone,bookPeople,bookDate;
    JTextField nm,em,ph,pl,dt;
    JTable tblBooking;


	MenuClass()
	{
		setSize(1400,700);
		setLocation(200,200);
		setLayout(null);
		setTitle("Fast Food Restaurent Management System");
		f=new Font("Baskerville Old Face",Font.BOLD,35);
		leftP=new JPanel();
		leftP.setLayout(null);
		upP=new JPanel();
		upP.setLayout(null);
		midP=new JPanel();
		midP.setLayout(null);
		orderp=new JPanel();
		orderp.setLayout(null);
		bookp=new JPanel();
		bookp.setLayout(null);
		sepP=new JPanel();
		icon1=new JLabel(new ImageIcon("reicon.jpg"));
        menu=new JButton("Menu");
        logout=new JButton("Logout");
        book=new JButton("Booking");
        order=new JButton("Order");
        menuhead=new JLabel("MENU");

        vegm=new JButton("Vegetarian");
        nonvegm=new JButton("Non-Vegetarian");
        dessertm=new JButton("Dessert");
        drinksm=new JButton("Drinks");

        a=new JTextArea();
        bookName=new JLabel("Customer Name");
        bookEmail=new JLabel("Email");
        bookPhone=new JLabel("Mobile No");
        bookPeople=new JLabel("No Of People");
        bookDate=new JLabel("Date");
        nm=new JTextField(30);
        em=new JTextField(30);
        ph=new JTextField(30);
        pl=new JTextField(30);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			    Date date1 = new Date();

        dt=new JTextField(30);
        dt.setText(String.valueOf(formatter.format(date1)));
        bookAdd=new JButton("Add");
        bookBook=new JButton("Book");
        bookDelete=new JButton("Delete");


        vego=new JButton("Vegetarian");
        nonvego=new JButton("Non-Vegetarian");
        desserto=new JButton("Dessert");
        drinkso=new JButton("Drinks");

        bill=new JButton("Bill");
        add=new JButton("Add");

        name=new JLabel("Name");
        date=new JLabel("Date/Time");
        //time=new JLabel("Time");
        cont=new JLabel("Contact No");
        totbill=new JLabel("Bill");


        jp=new JScrollPane(a,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
										  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);



        tm=new JTextField(30);
        td=new JTextField(30);
        td.setText(String.valueOf(formatter.format(date1)));
        //tt=new JTextField(30);
        tc=new JTextField(30);
        tb=new JTextField(30);

        dish=new JLabel("Select Dish Here :");
        q=new JLabel("Select Quantity Here :");
        ord=new JComboBox();
        qty=new JComboBox();

        a.setText("\t Fast Food Restaurent Management\n ");



		fast=new JLabel("Fast Food");
		res=new JLabel("Restaurent");

		vegm.addActionListener(this);
		nonvegm.addActionListener(this);
		dessertm.addActionListener(this);
		drinksm.addActionListener(this);

        vego.addActionListener(this);
		nonvego.addActionListener(this);
		desserto.addActionListener(this);
		drinkso.addActionListener(this);

		menu.addActionListener(this);
		book.addActionListener(this);
		order.addActionListener(this);
		add.addActionListener(this);
		bill.addActionListener(this);
		ord.addActionListener(this);
		qty.addActionListener(this);
		bookAdd.addActionListener(this);
		bookBook.addActionListener(this);
		bookDelete.addActionListener(this);
		logout.addActionListener(this);


		setMyColor();
		addMe();
		setMyPosition();
		setMyFont();
        setVisible(false);

	}

	public void setMyColor()
	{
		leftP.setBackground(new Color(20,100,120));
		upP.setBackground(new Color(255,0,0));
		midP.setBackground(new Color(50,210,200));
		orderp.setBackground(new Color(50,210,200));
        bookp.setBackground(new Color(50,210,200));



		sepP.setBackground(Color.WHITE);
		fast.setForeground(Color.WHITE);
		res.setForeground(Color.WHITE);
		menu.setForeground(Color.WHITE);
		order.setForeground(Color.WHITE);
		logout.setForeground(Color.WHITE);
		book.setForeground(Color.WHITE);
		menu.setBackground(new Color(20,100,120));
		order.setBackground(new Color(20,100,120));
		logout.setBackground(new Color(20,100,120));
		book.setBackground(new Color(20,100,120));
		menuhead.setForeground(Color.BLACK);
		menuhead.setBackground(new Color(20,100,120));

		vegm.setBackground(new Color(255,0,0));
		nonvegm.setBackground(new Color(255,0,0));
		dessertm.setBackground(new Color(255,0,0));
		drinksm.setBackground(new Color(255,0,0));

        vego.setBackground(new Color(255,0,0));
		nonvego.setBackground(new Color(255,0,0));
		desserto.setBackground(new Color(255,0,0));
		drinkso.setBackground(new Color(255,0,0));

		vego.setBackground(new Color(255,0,0));
		nonvego.setBackground(new Color(255,0,0));
        drinkso.setBackground(new Color(255,0,0));
        desserto.setBackground(new Color(255,0,0));
        bill.setBackground(new Color(255,0,0));
        add.setBackground(new Color(255,0,0));

        name.setBackground(new Color(50,210,200));
        date.setBackground(new Color(50,210,200));
       // time.setBackground(new Color(50,210,200));
        totbill.setBackground(new Color(50,210,200));
        cont.setBackground(new Color(50,210,200));

        vegm.setForeground(Color.WHITE);
        nonvegm.setForeground(Color.WHITE);
        dessertm.setForeground(Color.WHITE);
        drinksm.setForeground(Color.WHITE);


        vego.setForeground(Color.WHITE);
        nonvego.setForeground(Color.WHITE);
        desserto.setForeground(Color.WHITE);
        drinkso.setForeground(Color.WHITE);
        add.setForeground(Color.WHITE);
        bill.setForeground(Color.WHITE);
        dish.setForeground(Color.WHITE);
        q.setForeground(Color.WHITE);

        ord.setBackground(Color.WHITE);
        qty.setBackground(Color.WHITE);
        bookName.setForeground(Color.WHITE);
        bookEmail.setForeground(Color.WHITE);
        bookPhone.setForeground(Color.WHITE);
        bookPeople.setForeground(Color.WHITE);
        bookDate.setForeground(Color.WHITE);
        bookAdd.setForeground(Color.WHITE);
        bookBook.setForeground(Color.WHITE);
        bookDelete.setForeground(Color.WHITE);
        bookAdd.setBackground(new Color(255,0,0));
        bookBook.setBackground(new Color(255,0,0));
        bookDelete.setBackground(new Color(255,0,0));

	}

	public void addMe()
	{

		add(leftP);
		add(upP);
		add(midP);
		leftP.add(sepP);
		leftP.add(icon1);
		leftP.add(fast);
		leftP.add(res);
		leftP.add(menu);
		leftP.add(order);
	    leftP.add(book);
	    leftP.add(logout);
	    midP.add(menuhead);
	    midP.add(vegm);
	    midP.add(nonvegm);
	    midP.add(dessertm);
	    midP.add(drinksm);

	    add(orderp);
	    add(bookp);
	    orderp.add(vego);
	    orderp.add(nonvego);
	    orderp.add(desserto);
	    orderp.add(drinkso);
	    orderp.add(add);
	    orderp.add(bill);
	    orderp.setVisible(false);
	    bookp.setVisible(false);
	    orderp.add(name);
	    orderp.add(date);
	    //orderp.add(time);
	    orderp.add(totbill);
	    orderp.add(cont);
	    orderp.add(tm);
	    orderp.add(td);
	   // orderp.add(tt);
	    orderp.add(tb);
	    orderp.add(tc);
	    orderp.add(ord);
	    orderp.add(qty);
	    orderp.add(dish);
	    orderp.add(q);


	    orderp.add(jp);

	    bookp.add(bookName);
	    bookp.add(bookEmail);
	    bookp.add(bookPhone);
	    bookp.add(bookPeople);
	    bookp.add(bookDate);
	    bookp.add(bookAdd);
	    bookp.add(bookBook);
	    //bookp.add(bookDelete);
	    bookp.add(nm);
	    bookp.add(em);
	    bookp.add(ph);
	    bookp.add(pl);
	    bookp.add(dt);
	    //bookp.add(scr);



	}

	public void setMyPosition()
	{
		leftP.setBounds(1,1,300,700);
		upP.setBounds(300,1,1300,50);
		midP.setBounds(300,50,1300,650);
		orderp.setBounds(300,50,1300,650);
		bookp.setBounds(300,50,1300,650);
		menuhead.setBounds(50,20,200,40);
		sepP.setBounds(1,95,300,10);
		icon1.setBounds(1,1,90,90);
		fast.setBounds(91,5,200,30);
		res.setBounds(91,55,200,30);
		menu.setBounds(60,150,150,50);
		order.setBounds(60,250,150,50);
		book.setBounds(60,350,190,50);
		logout.setBounds(60,450,150,50);
		vegm.setBounds(10,110,350,70);
		nonvegm.setBounds(10,240,350,70);
		dessertm.setBounds(10,360,350,70);
		drinksm.setBounds(10,490,350,70);

		name.setBounds(20,20,80,30);
		tm.setBounds(120,20,250,30);
		date.setBounds(400,20,150,30);
		td.setBounds(560,20,250,30);
	   // time.setBounds(660,20,80,30);
	   // tt.setBounds(740,20,150,30);
	    cont.setBounds(20,60,150,30);
	    tc.setBounds(190,60,250,30);
	    totbill.setBounds(460,60,80,30);
	    tb.setBounds(550,60,200,30);

	    dish.setBounds(20,150,200,30);
	    ord.setBounds(20,200,480,40);
	    q.setBounds(20,260,250,30);
	    qty.setBounds(20,320,100,40);


        vego.setBounds(20,380,230,40);
		nonvego.setBounds(270,380,230,40);
		desserto.setBounds(20,450,230,40);
		drinkso.setBounds(270,450,230,40);
		bill.setBounds(20,510,230,40);
		add.setBounds(270,510,230,40);

		jp.setBounds(520,150,550,400);

		bookName.setBounds(20,50,200,30);
		bookEmail.setBounds(20,150,200,30);
		bookPhone.setBounds(20,250,200,30);
		bookPeople.setBounds(20,350,200,30);
		bookDate.setBounds(20,450,250,30);
		bookAdd.setBounds(20,520,100,40);
		bookBook.setBounds(190,520,100,40);
		bookDelete.setBounds(280,520,120,40);
		nm.setBounds(270,50,250,40);
		em.setBounds(270,150,250,40);
		ph.setBounds(270,250,250,40);
		pl.setBounds(270,350,250,40);
		dt.setBounds(270,450,250,40);






	}
	public void setMyFont()
	{
		fast.setFont(new Font("Baskerville Old Face",Font.BOLD,35));
		res.setFont(new Font("Baskerville Old Face",Font.BOLD,35));
		menu.setFont(f);
		logout.setFont(f);
		order.setFont(f);
		book.setFont(f);
		menuhead.setFont(new Font("Baskerville Old Face",Font.BOLD,40));
		vegm.setFont(f);
		nonvegm.setFont(f);
		dessertm.setFont(f);
		drinksm.setFont(f);
        name.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        date.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
       // time.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        totbill.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        cont.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        tm.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        td.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
       // tt.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        tb.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        tc.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        dish.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        q.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        ord.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        qty.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        vego.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        desserto.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        drinkso.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        nonvego.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        add.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bill.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookName.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookEmail.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookPhone.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookPeople.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookDate.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookAdd.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookBook.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        bookDelete.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        a.setFont(new Font("Baskerville Old Face",Font.BOLD,18));
        nm.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        em.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        ph.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        pl.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
        dt.setFont(new Font("Baskerville Old Face",Font.BOLD,25));







	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==menu)
		{
			midP.setVisible(true);
			bookp.setVisible(false);
			orderp.setVisible(false);

		}
		else if(ae.getSource()==order)
		{
			midP.setVisible(false);
			bookp.setVisible(false);
			orderp.setVisible(true);
		}
		else if(ae.getSource()==logout)
		{
			JOptionPane.showMessageDialog(null,"Loging Out ......");
			this.setVisible(false);
		}
		else if(ae.getSource()==book)
		{
            midP.setVisible(false);
			bookp.setVisible(true);
			orderp.setVisible(false);
		}
		else if(ae.getSource()==vegm)
		{
			String url = "jdbc:odbc:DSNFastFood";
			String x="Select * from tblVeg";
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("VegID");
			model.addColumn("VegName");
		    model.addColumn("VegPrice");
		    tbl = new JTable(model);

            scr = new JScrollPane(tbl,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
										  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();


				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)});
				}

				con.close();
			}

			catch(Exception e)
			{

			}
			scr.setBounds(500,110,450,450);

			midP.add(scr);

		}
		else if(ae.getSource()==nonvegm)
		{
            String url = "Jdbc:Odbc:DSNFastFood";
			String x="Select * from tblNonVeg";
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("NonVegID");
			model.addColumn("NonVegName");
		    model.addColumn("NonVegPrice");
		    tbl2 = new JTable(model);

            scr = new JScrollPane(tbl2,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
										  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();


				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)});
				}

				con.close();
			}

			catch(Exception e)
			{

			}
			scr.setBounds(500,110,450,450);

			midP.add(scr);
		}
		else if(ae.getSource()==dessertm)
		{
            String url = "Jdbc:Odbc:DSNFastFood";
			String x="Select * from tblDessert";
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("DessertID");
			model.addColumn("DessertName");
		    model.addColumn("DessertPrice");
		    tbl3 = new JTable(model);

            scr = new JScrollPane(tbl3,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
										  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();


				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)});
				}

				con.close();
			}

			catch(Exception e)
			{

			}
			scr.setBounds(500,110,450,450);

			midP.add(scr);
		}
		else if(ae.getSource()==drinksm)
		{
            String url = "Jdbc:Odbc:DSNFastFood";
			String x="Select * from tblGeneral";
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("DrinkID");
			model.addColumn("DrinkName");
		    model.addColumn("DrinkPrice");
		    tbl2 = new JTable(model);

            scr = new JScrollPane(tbl2,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
										  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();


				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3)});
				}

				con.close();
			}

			catch(Exception e)
			{

			}
			scr.setBounds(500,110,450,450);

			midP.add(scr);
		}
		else if(ae.getSource()==vego)
		{
            String url = "Jdbc:Odbc:DSNFastFood";
			String x="Select VegName from tblVeg";
			ord.removeAllItems();
			qty.removeAllItems();
		//	a.setText("\t Fast Food Restaurent Management\n ");


           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();


				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					ord.addItem(rs.getString(1));

				}
				for(int i=1;i<20;i++)
				{
					qty.addItem(""+i);
				}
                flag=1;
				con.close();
			}

			catch(Exception e)
			{

			}

		}
		else if(ae.getSource()==nonvego)
		{
            String url = "Jdbc:Odbc:DSNFastFood";
			String x="Select NonVegName from tblNonVeg";
			ord.removeAllItems();
			qty.removeAllItems();
//a.setText("\t Fast Food Restaurent Management\n ");

           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();


				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					ord.addItem(rs.getString(1));

				}
				for(int i=1;i<20;i++)
				{
					qty.addItem(""+i);
				}
                flag=2;
				con.close();
			}

			catch(Exception e)
			{

			}
		}
		else if(ae.getSource()==desserto)
		{
            String url = "Jdbc:Odbc:DSNFastFood";
			String x="Select DessertName from tblDessert";
			ord.removeAllItems();
			qty.removeAllItems();
			//a.setText("\t Fast Food Restaurent Management\n ");


           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();

				flag=3;
				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					ord.addItem(rs.getString(1));

				}
				for(int i=1;i<20;i++)
				{
					qty.addItem(""+i);
				}

				con.close();
			}

			catch(Exception e)
			{

			}

		}
		else if(ae.getSource()==drinkso)
		{

            String url = "Jdbc:Odbc:DSNFastFood";
			String x="Select GeneralName from tblGeneral";
			ord.removeAllItems();
			qty.removeAllItems();
			//a.setText("\t Fast Food Restaurent Management\n ");

			flag=4;
           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();


				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					ord.addItem(rs.getString(1));

				}
				for(int i=1;i<20;i++)
				{
					qty.addItem(""+i);
				}

				con.close();
			}

			catch(Exception e)
			{

			}
		}
		else if(ae.getSource()==add)
		{
			String y=(String)qty.getSelectedItem();
			int q=Integer.parseInt(y);
			String n=(String)ord.getSelectedItem();
			String area="";
            String x="";
            String url = "Jdbc:Odbc:DSNFastFood";
           if(flag==1)
           {
                 x="Select VegPrice from tblVeg where VegName='"+n+"'";
		   }
		   else if(flag==2)
		   {
			    x="Select NonVegPrice from tblNonVeg where NonVegName='"+n+"'";
		   }
		   else if(flag==3)
		   {
			    x="Select DessertPrice from tblDessert where DessertName='"+n+"'";
		   }
		   else if(flag==4)
		   {
			     x="Select GeneralPrice from tblGeneral where GeneralName='"+n+"'";
		   }

           int t=0;
           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();

                //a.setLineWrap(true);
				ResultSet rs = st.executeQuery(x);

				if(rs.next())
				{
					t=rs.getInt(1);
					amt=amt+t*q;



				}
				con.close();
			}

			catch(Exception e)
			{

			}
			a.append(""+n+"\t"+q+"\t"+t+"\n");
			tb.setText(String.valueOf(amt));
			tb.setEnabled(false);

		}
		else if(ae.getSource()==bill)
		{

            tb.setText(String.valueOf(amt));
			a.append("Total Bill\t"+amt);
			//a.setEnabled(false);

           String url = "Jdbc:Odbc:DSNFastFood";


           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();

                String x1="insert into tblOrder (OrderName,OrderDate,OrderBill,OrderMobile)"+
                          " values('"+tm.getText()+"','"+td.getText()+"',"+amt+",'"+tc.getText()+"')";
                st.execute(x1);

				JOptionPane.showMessageDialog(null,"Order Saved Successfully!!");


				con.close();
			}

			catch(Exception e)
			{

			}
			tm.setText("");
						tc.setText("");
						tb.setText("");

			tb.setEnabled(true);
			a.setText("\t Fast Food Restaurent Management\n ");




		}
		else if(ae.getSource()==bookBook)
		{

		    String url = "Jdbc:Odbc:DSNFastFood";


           try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();
                String x ="Select * from tblBooking";
                String x1="insert into tblBooking (BookingName,BookingMobile,BookingDate,BookingEmail,BookingNoPeople)"+
                          " values('"+nm.getText()+"','"+ph.getText()+"','"+dt.getText()+"','"+em.getText()+"',"+Integer.parseInt(pl.getText())+")";
                st.execute(x1);

				JOptionPane.showMessageDialog(null,"Booking Done Successfully!!");


				con.close();
			}

			catch(Exception e)
			{

			}


		}
		else if(ae.getSource()==bookAdd)
		{
			nm.setText("");
			em.setText("");
			ph.setText("");
			pl.setText("");

			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("BookingID");
			model.addColumn("Name");
			model.addColumn("Email");
		    model.addColumn("Mobile No");
		    model.addColumn("No of People");
		    model.addColumn("Booking Date");
		    String url = "Jdbc:Odbc:DSNFastFood";
		    tblBooking=new JTable(model);
						scr = new JScrollPane(tblBooking,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
										  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            try
		   {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();
                String x ="Select * from tblBooking";
				ResultSet rs = st.executeQuery(x);

				while(rs.next())
				{
					model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6)});

				}


				con.close();
			}

			catch(Exception e)
			{

			}
            scr.setBounds(550,50,500,500);
            bookp.add(scr);


		}
	}


}