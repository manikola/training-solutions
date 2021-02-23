package exam03retake01;

import exam03retake01.Contact;
import exam03retake01.Mail;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public List<Mail> getMails() {
        return mails;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }


    public List<Mail> findByCriteria(String criteria) {
        List<Mail> results = new ArrayList<>();
        if (criteria.contains(":")) {
            String[] arr = criteria.split(":");
            String direction = arr[0];
            String person = arr[1];
            for (Mail item : mails) {
                if (direction.equals("from")) {
                    if (item.getFrom().getEmail().equals(person) || item.getFrom().getName().equals(person)) {
                        results.add(item);
                    }
                }
                if (direction.equals("to")) {
                    for(Contact i : item.getTo())
                 if (i.getEmail().equals(person) || i.getName().equals(person)) {
                        results.add(item);
                    }
                }
            }
            }else{
                for (Mail item : mails) {
                    if (item.getMessage().contains(criteria) || item.getSubject().contains(criteria)) {
                        results.add(item);
                    }
                }



        }
        return results;
    }
}
