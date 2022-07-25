public with sharing class OpportunityTriggerHandler {
    public static void beforeInsert(List<Opportunity> oppList) {
        Account acc;
        List<Account> accList = new List<Account>();
        Contact con;
        List<Contact> conList = new List<Contact>();
        for(Opportunity opp : oppList) {
            if(opp.ContactId == null && opp.AccountId == null) {
                acc = new Contact();
                con = new Account();
                acc.Name = opp.Name;
                acc.Id = opp.AccountId;
                accList.add(acc);
                con.LastName = opp.Name;
                con.Phone = opp.Phone;
                con.Id = opp.ContactId;
                conList.add(con);
            }
        }
        if(accList.size() > 0 && conList.size() > 0) {
            insert accList;
            insert conList;
        } 
    }

//    public static void beforeUpdate(List<Opportunity> oppList) {
//        for(Opportunity opp : oppList) {
//            if(opp.AccountId == null && opp.ContactId == null) {

//            }
//       }
    }
}