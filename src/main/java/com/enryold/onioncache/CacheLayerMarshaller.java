package com.enryold.onioncache;

/**
 * Created by enryold on 16/01/17.
 */
public class CacheLayerMarshaller<I, O>
{
    private Class<I> inputClazz;
    private Class<O> outputClazz;

    public CacheLayerMarshaller(Class<I> iClazz, Class<O> oClazz)
    {
        this.inputClazz = iClazz;
        this.outputClazz = oClazz;
    }

    public Class<I> getInputClazz() {
        return inputClazz;
    }

    public Class<O> getOutputClazz() {
        return outputClazz;
    }
}