package exam02.senior;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {

    private List<Photo> photos = new ArrayList<>();


    public List<Photo> getPhotos() {
        return new ArrayList<>(photos);
    }

    public void addPhoto(String... photo) {
        for (String item : photo) {
            photos.add(new Photo(item));
        }
    }

    public void starPhoto(String name, Quality quality) {
        boolean isPhotoInPhotos = false;
        for (Photo p : photos) {
            if (p.getName().equals(name)) {
                p.setQuality(quality);
                isPhotoInPhotos = true;
            }
        }
        if (!isPhotoInPhotos) {
            throw new PhotoNotFoundException("No such photo!");
        }
    }



    public int numberOfStars(){
        int sum = 0;
        for(Photo item : photos){
            sum += item.getQuality().getStars();
        }
        return sum;
    }

}
