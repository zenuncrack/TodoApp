/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoapp;

import java.time.LocalDate;

/**
 *
 * @author ashik
 */
public class LocalEvent {
    private String description;
    private LocalDate date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocaldate() {
        return date;
    }

    public void setLocaldate(LocalDate localdate) {
        this.date = localdate;
    }
    public LocalEvent(LocalDate date , String description)
    {
        this.setLocaldate(date);
        this.setDescription(description);
    }
    
    public String toString()
    {
        
        return "At : "+this.getLocaldate()+" : "+this.getDescription();
        
    }
}
