package org.jpl7;

import java.util.Map;

import org.jpl7.fli.Prolog;
import org.jpl7.fli.term_t;

/**
 * JRef is deprecated.
 * 
 * <p>
 * Replace
 * </p>
 * 
 * <pre>
 * new JRef(object)
 * </pre>
 * <p>
 * by
 * </p>
 * 
 * <pre>
 * JPL.newJRef(object)
 * </pre>
 * 
 * <hr>
 * Copyright (C) 2004 Paul Singleton
 * <p>
 * Copyright (C) 1998 Fred Dushin
 * <p>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * <ol>
 * <li>Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * <li>Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * </ol>
 *
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * <hr>
 * 
 * @author Fred Dushin <fadushin@syr.edu>
 * @version $Revision$
 * @see org.jpl7.Compound
 * @see org.jpl7.JObject
 * @see org.jpl7.Term
 * 
 * @deprecated
 */
public class JRef extends Term {

	/**
	 * the JRef's value (a non-String Object or null)
	 */
	protected final Object ref;

	/**
	 * This constructor creates a JRef, initialized with the supplied non-String
	 * object (or null).
	 * 
	 * @param ref
	 *            this JRef's value (a non-String object, or null)
	 */
	public JRef(Object ref) {
		if (ref instanceof String) {
			throw new JPLException("a JRef cannot reference a String (Strings are represented by text atoms)");
		} else {
			this.ref = ref;
		}
	}

	/**
	 * Two JRefs are equal if their referenced objects are identical
	 * 
	 * @param obj
	 *            The Object to compare
	 * @return true if the Object satisfies the above condition
	 */
	public final boolean equals(Object obj) {
		return this == obj || (obj instanceof JRef && ref == ((JRef) obj).ref);
	}

	public boolean hasFunctor(String name, int arity) {
		return false;
	}

	public Object jrefToObject() {
		return ref;
	}

	/**
	 * To convert a JRef to a term, we put its Object field (.value) into the
	 * term_t as a JPL ref (i.e. @/1) structure.
	 * 
	 * @param varnames_to_vars
	 *            A Map from variable names to Prolog variables.
	 * @param term
	 *            A (newly created) term_t which is to be set to a Prolog 'ref'
	 *            (i.e. @/1) structure denoting the .value of this JRef instance
	 */
	protected final void put(Map<String, term_t> varnames_to_vars, term_t term) {
		Prolog.put_jref(term, ref);
	}

	/**
	 * The non-String object (or null) which this jpl.JRef represents
	 * 
	 * @return the non-String object (or null) which this jpl.JRef represents
	 */
	public Object ref() {
		return ref;
	}

	/**
	 * Returns a Prolog source text representation of this JRef
	 * 
	 * @return a Prolog source text representation of this JRef
	 */
	public String toString() {
		return "" + ref + ""; // WRONG
	}

	public final int type() {
		return Prolog.JREF;
	}

	public String typeName() {
		return "JRef";
	}

}