class Triangle {
    public int side1;
    public int side2;
    public int side3;

    public Triangle (int s1, int s2, int s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public String TriangleTracker() {
        if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2){
            return "not a valid triangle";
        }
        else if (side1 == side2 && side2 == side3){
            return "Equilateral";
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3){
            return "Isoceles";
        }
        else {
            return "Scalene";
        }
    }
}