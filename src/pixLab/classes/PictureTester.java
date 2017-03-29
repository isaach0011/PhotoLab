package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Isaac Hill
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("chris.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture barbara = new Picture("chris.jpg");
	  barbara.explore();
	  barbara.mirrorVerticalRightToLeft();
	  //barbara.zeroBlue();
	  //barbara.zeroRed();
	  //barbara.zeroGreen();
	  barbara.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
	  Picture cody = new Picture("chris.jpg");
	  cody.explore();
	  cody.mirrorHorizontalBottomtoTop();
	  cody.mirrorVerticalRightToLeft();
	  //cody.zeroBlue();
	  //cody.zeroGreen();
	  //cody.zeroRed();
	  cody.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture cody = new Picture("cody.jpg");
	  cody.explore();
	  cody.mirrorVertical();
	  cody.mirrorHorizontalBottomtoTop();
	  cody.mirrorDiagonalUphill();
	  cody.mirrorHorizontalTopToBottom();
	  //cody.mirrorDiagonal();
	  //cody.zeroBlue();
	  cody.zeroGreen();
	 // cody.zeroRed();
	  cody.write("Cody3_0.jpg");
	  cody.explore();
  }
  
  public static void testMirrorDiagonalUphill()
  {
	  Picture cody = new Picture("cody.jpg");
	  cody.explore();
	  cody.mirrorDiagonalUphill();
	  cody.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
	 Picture gull = new Picture("seagull.jpg");
	 gull.explore();
	 gull.mirrorGull();
	 gull.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture man = new Picture("snowman.jpg");
	  man.explore();
	  man.mirrorArms();
	  man.explore();
	  
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.personalCollage();
    canvas.explore();
  }
  
  public static void testPersonalCollage()
  {
    Picture canvas = new Picture("neat.jpg");
    canvas.personalCollage();
    canvas.explore();
  }
  
  public static void testCoolCopy()
  {
	    Picture canvas = new Picture("neat.jpg");
	    canvas.copyTest();
	    canvas.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testGlitch()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.glitchArt();
	  beach.write("Isaac's_Awesome_Glitch_Art.jpg");
	  beach.explore();
  }
  public static void testDeteccionDeBordes()
  {
	  Picture chris = new Picture("swan.jpg");
	  chris.deteccionDeBordes(40);
	  chris.explore();
  }
  
  public static void valentineFilter()
  {
	  Picture rollsafe = new Picture("rollsafe.jpg");
	  rollsafe.addCustomMessage("You can't get rejected if you don't ask them out", 10, 25);
	  rollsafe.explore();
	  rollsafe.write("rollsafevalentine.jpg");
  }
  
  public static void testSteganography()
  {
	  Picture brick = new Picture("brick.jpg");
	  Picture brickPic = new Picture("brick.jpg");
	  Picture hidden = new Picture("hiddenpicture.jpg");
	  Picture hiddenPicture = new Picture("hidden.jpg");
	  brick.encode(hidden);
	  brick.explore();
	  brick.decode();
	  brick.explore();
	  brickPic.encode(hiddenPicture);
	  brickPic.decode();
	  brickPic.explore();
	  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public void start()
  {
	    // uncomment a call here to run a test
	    // and comment out the ones you don't want
	    // to run
	 //   testZeroBlue();
	  //  testGlitch();
	    testSteganography();
//	    testKeepOnlyBlue();
//	    testKeepOnlyRed();
//	    testKeepOnlyGreen();
//	    testNegate();
//	    testGrayscale();
//	    testFixUnderwater();
//		testMirrorDiagonal();
//		testMirrorDiagonalUphill();
//	    testMirrorVertical();
	 //   testMirrorVerticalRightToLeft();
	 //   testMirrorHorizontalBottomToTop();
//	    testMirrorTemple();
	//    testMirrorArms();
	//    testDeteccionDeBordes();
	  //  testMirrorGull();
//	    testMirrorDiagonal();
	//    testCollage();
	//    testPersonalCollage();
//	  valentineFilter();
//	    testCopy();
//	    testEdgeDetection();
//	    testEdgeDetection2();
//	    testChromakey();
//	    testEncodeAndDecode();
//	    testGetCountRedOverValue(250);
//	    testSetRedToHalfValueInTopHalf();
//	    testClearBlueOverValue(200);
//	    testGetAverageForColumn(0);
  }
}