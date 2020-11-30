package immutable;

public class Satellite {

    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;

    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    @Override
    public String toString() {
        return registerIdent +": " + getDestinationCoordinates();
    }

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.destinationCoordinates = destinationCoordinates;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates difference) {
        destinationCoordinates = new CelestialCoordinates(destinationCoordinates.getX() + difference.getX(),destinationCoordinates.getY() + difference.getY(), destinationCoordinates.getZ() + difference.getZ());
    }







    private boolean isEmpty(String str) {
        return str == null || str.trim().equals("");
    }

}
