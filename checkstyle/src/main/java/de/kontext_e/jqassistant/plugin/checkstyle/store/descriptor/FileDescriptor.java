package de.kontext_e.jqassistant.plugin.checkstyle.store.descriptor;

import java.util.Set;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.core.store.api.model.FullQualifiedNameDescriptor;
import com.buschmais.jqassistant.core.store.api.model.NamedDescriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * @author jn4, Kontext E GmbH, 11.02.14
 */
@Label("CheckstyleFile")
public interface FileDescriptor extends Descriptor, NamedDescriptor, FullQualifiedNameDescriptor {

    @Relation("CHECKSTYLE_ERRORS")
    Set<ErrorDescriptor> getErrors();
}
