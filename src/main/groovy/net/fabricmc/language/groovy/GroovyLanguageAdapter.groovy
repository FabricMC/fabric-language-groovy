package net.fabricmc.language.groovy

import net.fabricmc.loader.api.LanguageAdapter
import net.fabricmc.loader.api.LanguageAdapterException
import net.fabricmc.loader.api.ModContainer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class GroovyLanguageAdapter implements LanguageAdapter  {

    private Logger LOGGER = LogManager.getFormatterLogger("GroovyLanguageAdapter");

    @Override
    def <T> T create(ModContainer modContainer, String s, Class<T> aClass) throws LanguageAdapterException {
        Class groovyClass = Class.forName(aClass.getName());
        if(groovyClass == null) {
            LOGGER.debug("Unable to find Groovy object instance for ${aClass.name}, constructing new instance");
            groovyClass;
        }
        return aClass.newInstance();
    }
}
