package pl.javastart.springmvcdispatch.component;

import org.springframework.stereotype.Controller;
import pl.javastart.springmvcdispatch.model.Participant;

import java.util.LinkedList;
import java.util.List;

@Controller
public class EventHolder {
    private List<Participant> participants;

    public EventHolder() {
        participants = new LinkedList<>();
    }

    public void addParticipant(Participant participant){
        participants.add(participant);
    }

    public List<Participant> getParticipants(){
        return participants;
    }

    public boolean checkRegistration(Participant participant){
        return participants.contains(participant);
    }
}
