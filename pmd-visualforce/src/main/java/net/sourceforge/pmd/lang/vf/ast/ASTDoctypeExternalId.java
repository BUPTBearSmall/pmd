/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTDoctypeExternalId.java */

package net.sourceforge.pmd.lang.vf.ast;

public class ASTDoctypeExternalId extends AbstractVFNode {

    /**
     * URI of the external entity. Cannot be null.
     */
    private String uri;

    /**
     * Public ID of the external entity. This is optional.
     */
    private String publicId;

    public ASTDoctypeExternalId(int id) {
        super(id);
    }

    public ASTDoctypeExternalId(VfParser p, int id) {
        super(p, id);
    }

    public boolean isHasPublicId() {
        return null != publicId;
    }

    /**
     * @return Returns the name.
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param name
     *            The name to set.
     */
    public void setUri(String name) {
        this.uri = name;
    }

    /**
     * @return Returns the publicId (or an empty string if there is none for
     *         this external entity id).
     */
    public String getPublicId() {
        return null == publicId ? "" : publicId;
    }

    /**
     * @param publicId
     *            The publicId to set.
     */
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(VfParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
