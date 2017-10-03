/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-fbdb7c7 modeling language!*/


import java.util.*;

// line 2 "model.ump"
// line 47 "model.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String name;
  private String phoneNumber;
  private String address;
  private String emailAddress;

  //Customer Associations
  private List<Account> accounts;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aName, String aPhoneNumber, String aAddress, String aEmailAddress)
  {
    name = aName;
    phoneNumber = aPhoneNumber;
    address = aAddress;
    emailAddress = aEmailAddress;
    accounts = new ArrayList<Account>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmailAddress(String aEmailAddress)
  {
    boolean wasSet = false;
    emailAddress = aEmailAddress;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getAddress()
  {
    return address;
  }

  public String getEmailAddress()
  {
    return emailAddress;
  }

  public Account getAccount(int index)
  {
    Account aAccount = accounts.get(index);
    return aAccount;
  }

  public List<Account> getAccounts()
  {
    List<Account> newAccounts = Collections.unmodifiableList(accounts);
    return newAccounts;
  }

  public int numberOfAccounts()
  {
    int number = accounts.size();
    return number;
  }

  public boolean hasAccounts()
  {
    boolean has = accounts.size() > 0;
    return has;
  }

  public int indexOfAccount(Account aAccount)
  {
    int index = accounts.indexOf(aAccount);
    return index;
  }

  public static int minimumNumberOfAccounts()
  {
    return 0;
  }

  public boolean addAccount(Account aAccount)
  {
    boolean wasAdded = false;
    if (accounts.contains(aAccount)) { return false; }
    accounts.add(aAccount);
    if (aAccount.indexOfCustomer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAccount.addCustomer(this);
      if (!wasAdded)
      {
        accounts.remove(aAccount);
      }
    }
    return wasAdded;
  }

  public boolean removeAccount(Account aAccount)
  {
    boolean wasRemoved = false;
    if (!accounts.contains(aAccount))
    {
      return wasRemoved;
    }

    int oldIndex = accounts.indexOf(aAccount);
    accounts.remove(oldIndex);
    if (aAccount.indexOfCustomer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAccount.removeCustomer(this);
      if (!wasRemoved)
      {
        accounts.add(oldIndex,aAccount);
      }
    }
    return wasRemoved;
  }

  public boolean addAccountAt(Account aAccount, int index)
  {  
    boolean wasAdded = false;
    if(addAccount(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAccountAt(Account aAccount, int index)
  {
    boolean wasAdded = false;
    if(accounts.contains(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAccountAt(aAccount, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Account> copyOfAccounts = new ArrayList<Account>(accounts);
    accounts.clear();
    for(Account aAccount : copyOfAccounts)
    {
      aAccount.removeCustomer(this);
    }
  }

  // line 10 "model.ump"
   public void getphoneNumber(){
    
  }

  // line 13 "model.ump"
   public void getname(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "phoneNumber" + ":" + getPhoneNumber()+ "," +
            "address" + ":" + getAddress()+ "," +
            "emailAddress" + ":" + getEmailAddress()+ "]";
  }
}