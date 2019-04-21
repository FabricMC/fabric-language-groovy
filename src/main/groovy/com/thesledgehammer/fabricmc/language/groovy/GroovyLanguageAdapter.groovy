package com.thesledgehammer.fabricmc.language.groovy

import net.fabricmc.loader.language.LanguageAdapter
import net.fabricmc.loader.language.LanguageAdapterException
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class GroovyLanguageAdapter implements LanguageAdapter {

    private Logger LOGGER = LogManager.getFormatterLogger("GroovyLanguageAdapter");

    @Override
    Object createInstance(Class<?> aClass, Options options) throws LanguageAdapterException {
        Class groovyClass = Class.forName(aClass.getName());
        def moduleField = groovyClass.getField("MODULE");
        def instance = moduleField.get(null);
        try {
            if(instance == null) {
                throw new NullPointerException();
            }
        } finally {
            LOGGER.debug("Unable to find Groovy object instance for ${aClass.name}, constructing new instance");
            instance;
        }
        return aClass.newInstance();
    }
}
