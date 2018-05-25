double next_gaussian()
{
    double x = rng.nextGaussian();  //Use whichever method you like 
                                    //here to generate an initial [-1,1] gaussian distribution

    y = (x * 0.5) + 0.5;                //Rescale to [0,1]

    return Math.rint(y * 100000.0) * 0.00001; //Quantize to step size 0.00001
}