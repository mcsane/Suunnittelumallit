import java.util.ArrayList;
import java.util.List;

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {
        List<Image> photoAlbum = new ArrayList<Image>();
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo1"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo2"));
        photoAlbum.add(new ProxyImage("HiRes_10MB_Photo3"));
 
        System.out.println("Printing the photos in the album:");
        for (Image image : photoAlbum) {
            image.showData();
        }

        System.out.println("Displaying the photos in the album:");
        for (Image image : photoAlbum) {
            image.displayImage();
        }
     }
 }