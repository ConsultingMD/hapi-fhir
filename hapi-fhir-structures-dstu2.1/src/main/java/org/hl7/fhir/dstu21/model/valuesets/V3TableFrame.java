package org.hl7.fhir.dstu21.model.valuesets;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Mon, Dec 21, 2015 19:58-0500 for FHIR v1.2.0


import org.hl7.fhir.exceptions.FHIRException;

public enum V3TableFrame {

        /**
         * above
         */
        ABOVE, 
        /**
         * below
         */
        BELOW, 
        /**
         * border
         */
        BORDER, 
        /**
         * box
         */
        BOX, 
        /**
         * hsides
         */
        HSIDES, 
        /**
         * lhs
         */
        LHS, 
        /**
         * rhs
         */
        RHS, 
        /**
         * void
         */
        VOID, 
        /**
         * vsides
         */
        VSIDES, 
        /**
         * added to help the parsers
         */
        NULL;
        public static V3TableFrame fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("above".equals(codeString))
          return ABOVE;
        if ("below".equals(codeString))
          return BELOW;
        if ("border".equals(codeString))
          return BORDER;
        if ("box".equals(codeString))
          return BOX;
        if ("hsides".equals(codeString))
          return HSIDES;
        if ("lhs".equals(codeString))
          return LHS;
        if ("rhs".equals(codeString))
          return RHS;
        if ("void".equals(codeString))
          return VOID;
        if ("vsides".equals(codeString))
          return VSIDES;
        throw new FHIRException("Unknown V3TableFrame code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ABOVE: return "above";
            case BELOW: return "below";
            case BORDER: return "border";
            case BOX: return "box";
            case HSIDES: return "hsides";
            case LHS: return "lhs";
            case RHS: return "rhs";
            case VOID: return "void";
            case VSIDES: return "vsides";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/v3/TableFrame";
        }
        public String getDefinition() {
          switch (this) {
            case ABOVE: return "above";
            case BELOW: return "below";
            case BORDER: return "border";
            case BOX: return "box";
            case HSIDES: return "hsides";
            case LHS: return "lhs";
            case RHS: return "rhs";
            case VOID: return "void";
            case VSIDES: return "vsides";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ABOVE: return "above";
            case BELOW: return "below";
            case BORDER: return "border";
            case BOX: return "box";
            case HSIDES: return "hsides";
            case LHS: return "lhs";
            case RHS: return "rhs";
            case VOID: return "void";
            case VSIDES: return "vsides";
            default: return "?";
          }
    }


}

