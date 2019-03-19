//package com.epam.logg;
//
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//
//public class ExampleSMS {
//
//
//  // Find your Account Sid and Token at twilio.com/user/account
//  public static final String ACCOUNT_SID = "ACfe3d95a848d547acaaa69bdbf57229d0";
//  public static final String AUTH_TOKEN = "5b601af873ed5d76cbc48487d5382562";
//
//  public static void send(String str) {
//    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//    Message message = Message.creator(new PhoneNumber("+380684222257"), /*my phone number*/
//        new PhoneNumber("+18185325196"), str).create(); /*attached to me number*/
//  }
//}
//
//
