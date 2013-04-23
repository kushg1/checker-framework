
import checkers.initialization.quals.*;
import checkers.nullness.quals.*;

public class Commitment2 {
    
    //:: error: (assignment.type.incompatible)
    Commitment2 g = create();
    
    Commitment2 h;
    
    @NotOnlyInitialized Commitment2 c;
    
    @NotOnlyInitialized Commitment2 f;
    public void test(@UnderInitializion Commitment2 c) {
        //:: error: (commitment.invalid.field.write.committed)
        f = c;
    }
    
    public static @UnknownInitialization Commitment2 create() {
        return new Commitment2();
    }
    
    //:: error: (commitment.fields.uninitialized)
    public Commitment2() {
        
    }
    
    //:: error: (commitment.fields.uninitialized)
    public Commitment2(@UnderInitializion Commitment2 likeAnEagle) {
        //:: error: (assignment.type.incompatible)
        h = likeAnEagle;
        
        c = likeAnEagle;
    }
}
