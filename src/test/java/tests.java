import com.mycompany.actividad11.Operaciones;
import org.junit.Test;
import static org.junit.Assert.*;



public class tests {
    Operaciones op = new Operaciones();
    
    //test 1
    @Test
    public void Suma1() {
        assertEquals(5, op.Sumas(2, 3));
    }
    @Test
    public void Suma2() {
        assertEquals(-9, op.Sumas(-3, -6));
    }
    @Test
    public void Suma3() {
        assertEquals(10, op.Sumas(7, 3));
    }
    @Test
    public void Suma4() {
        assertEquals(90, op.Sumas(88, 2));
    }
    
    //test 2
    @Test
    public void triArea1(){        
    assertEquals(3, op.triArea(3, 2));
    }
    @Test
    public void triArea2(){        
    assertEquals( 10, op.triArea(5, 4));
    }
    @Test
    public void triArea3(){                
    assertEquals(50, op.triArea(10, 10));
    }
    @Test
    public void triArea4(){        
    assertEquals(0, op.triArea(0, 60));
    }
    @Test
    public void triArea5(){        
    assertEquals(66, op.triArea(12, 11));
    }
    
    //test 3
    @Test
    public void howManySeconds1(){
    assertEquals(7200, op.howManySeconds(2));
    }
    @Test
    public void howManySeconds2(){
    assertEquals(36000, op.howManySeconds(10));
    }
    @Test
    public void howManySeconds3(){
    assertEquals(86400, op.howManySeconds(24));
    }
    @Test
    public void howManySeconds4(){
    assertEquals(129600, op.howManySeconds(36));
    }
    
}

