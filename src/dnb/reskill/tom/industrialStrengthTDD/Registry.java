package dnb.reskill.tom.industrialStrengthTDD;

import java.util.HashMap;
import java.util.UUID;

public class Registry {
    HashMap<UUID,Student> studentRegistry = new HashMap<UUID,Student>();
    private UUID studentID;
    public Student registerStudent(String studentName){

        /*•	The Registry class should have a registerStudent() method,
         which receives the student's name as a parameter.
         The method should create a new Student object with a unique id,
          and insert it into the map. The method should return the Student object.*/
        UUID studentID = generateUniqueStudentID();
        Student newStudent = new Student(studentID,studentName);
        studentRegistry.put(studentID,newStudent);
        return newStudent;

    }
    public Student findStudent (UUID studentID) throws IllegalArgumentException{
        /*Registry class should have a findStudent() method,
        which receives a student id as a parameter. The method should return the Student object
        for that id if found, or throw an exception otherwise.*/
        if(studentRegistry.containsKey(studentID)){
            Student returnStudent = studentRegistry.get(studentID);
            return returnStudent;
        }
        throw new IllegalArgumentException("ID is not in registry");
    }
    public void unregisterStudent(UUID studentID) throws IllegalArgumentException{
        /*•	The Registry class should have an unregisterStudent() method, which receives a student
        id as a parameter.
        The method should remove the Student object from the map if the id is found, or throw an exception otherwise.*/

        if(studentRegistry.containsKey(studentID)){
            studentRegistry.remove(studentID);
        }
        else {
            throw new IllegalArgumentException("student ID does not exist");
        }

    }
    public int getStudentRegistrySize(){
        return studentRegistry.size();
    }
    public UUID generateUniqueStudentID(){
        UUID uniqueID = UUID.randomUUID();
        return uniqueID;
    }

    @Override
    public String toString() {
        return "Registry{" +
                "studentRegistry=" + studentRegistry +
                ", studentID=" + studentID +
                '}';
    }
}
