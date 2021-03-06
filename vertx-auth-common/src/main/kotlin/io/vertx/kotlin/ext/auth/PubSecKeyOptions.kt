package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.PubSecKeyOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.PubSecKeyOptions] objects.
 *
 * Options describing how a Cryptographic Key.
 *
 * @param publicKey 
 * @param secretKey 
 * @param type 
 * @param x509Certificates 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.PubSecKeyOptions original] using Vert.x codegen.
 */
fun PubSecKeyOptions(
  publicKey: String? = null,
  secretKey: String? = null,
  type: String? = null,
  x509Certificates: Iterable<String>? = null): PubSecKeyOptions = io.vertx.ext.auth.PubSecKeyOptions().apply {

  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (secretKey != null) {
    this.setSecretKey(secretKey)
  }
  if (type != null) {
    this.setType(type)
  }
  if (x509Certificates != null) {
    this.setX509Certificates(x509Certificates.toList())
  }
}

