/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author HP
 */
public class XFile1 {

public static String writeObject(String tenFile, Object obj ){
     String kq="Thanh cong";
    try{
    FileOutputStream fos = new FileOutputStream(tenFile);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(obj);
    oos.close();
    fos.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return kq;
}

public static Object readObject(String tenFile) throws FileNotFoundException, IOException, ClassNotFoundException{
    Object kq;
        FileInputStream fis = new FileInputStream(tenFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        kq = ois.readObject();
        ois.close();
        fis.close();
        return kq;
}
}


