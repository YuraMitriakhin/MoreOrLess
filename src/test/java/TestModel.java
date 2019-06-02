import com.gamil.yuramitryahin.Model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestModel {

   private  Model model;
   private  int min=0;
   private int max=100;
   private  int value=50;

   @Before
    public void setDate(){
       model = new Model();
       model.setRange(min,max);
       model.setValue(value);
   }

   @Test
    public void testCheckValueMin(){
       int r = (int)(Math.random()*(value-1))+(min+1);
       model.checkValue(r);
       Assert.assertTrue(r==model.getMin());
   }

    @Test
    public void testCheckValueMax(){
        int r = (int)(Math.random()*(max-1))+(value+1);
        model.checkValue(r);
        Assert.assertTrue(r==model.getMax());
    }

    @Test
    public void testRandValue(){
       List<Integer> list = randList();
       for(Integer i: list){
           if(i>=max || i<=min){
               Assert.fail();
           }
       }
      Assert.assertTrue(true);
    }

    public List randList(){
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<(max-min)*10; i++){
            list.add((int)(Math.random()*(max-1))+(min+1));
        }
        return list;
    }
}
