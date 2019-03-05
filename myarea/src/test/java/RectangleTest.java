import org.junit.Assert;
import org.junit.Test;

 public class RectangleTest {

     private Rectangle rectangle;

      @Test
      public void shouldThrowExceptionWhenLengthIsZero(){
          try {
              rectangle = new Rectangle(0,10) ;
              Assert.fail("Error")  ;
          } catch (Exception e) {
              Assert.assertEquals("Invalid Arguments",e.getMessage());
          }
      }

     @Test
     public void shouldThrowExceptionWhenBreadthIsZero() {
         try {
             rectangle = new Rectangle(10,0) ;
             Assert.fail("Error")  ;
         } catch (Exception e) {
             Assert.assertTrue(e.getMessage(),true);
         }
     }

     @Test
     public void shouldThrowExceptionWhenOneArgumentIsNegative() {
         try {
             rectangle = new Rectangle(-1,10) ;
             Assert.fail("Error");
         } catch (Exception e) {
             Assert.assertTrue("Invalid Arguments",true);
         }
     }
     @Test
     public void shouldReturnPerimeter40WhenLengthAndBreadthAre10() {
         try {
             rectangle = new Rectangle(10,10) ;
             Assert.assertEquals(40,rectangle.calculatePerimeter());
         } catch (Exception e) { }
     }
     @Test
     public void shouldReturnArea30WhenLengthIs6AndBreadthIs5() {
         try {
             rectangle = new Rectangle(6,5) ;
             Assert.assertEquals(30,rectangle.calculateArea());
         } catch (Exception e) { }
     }
    //--Square Tests--//
     @Test
     public void shouldThrowExceptionWhenSideIsZero() {
         try {
             rectangle = new Rectangle(0) ;
             Assert.fail("Error")  ;
         } catch (Exception e) {
             Assert.assertTrue(e.getMessage(),true);
         }
     }
     @Test
     public void shouldThrowExceptionWhenSideIsNegative() {
         try {
             rectangle = new Rectangle(-1) ;
             Assert.fail("Error")  ;
         } catch (Exception e) {
             Assert.assertTrue(e.getMessage(),true);
         }
     }
     @Test
     public void shouldReturnArea25WhenSideIs5() {
         try {
             rectangle = new Rectangle(5) ;
             Assert.assertEquals(25,rectangle.calculateArea());
         } catch (Exception e) { }
     }
     @Test
     public void shouldReturnPerimeter20WhenSideIs5() {
         try {
             rectangle = new Rectangle(5) ;
             Assert.assertEquals(20,rectangle.calculatePerimeter());
         } catch (Exception e) { }
     }
}
