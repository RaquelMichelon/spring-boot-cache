package com.michelon.learningcache;

import java.io.Serializable;

/**
 * @autor raqueldarellimichelon
 * created on 30/05/23 inside the package - com.michelon.learningcache
 * In order to provide serialization for redis db, we have to implements Serializable
 **/
public record Product(Long id, String name, String description) implements Serializable {
}
