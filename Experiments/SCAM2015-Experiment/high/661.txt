public void setPartner(Partner b) {
  // Special case, otherwise we'll have troubles
  // when this.partner is already b.
  if (this.partner == b) return;

  if (this.partner != null) {
    this.partner.partner = null;
  }

  this.partner = b;

  // Make sure that the new partner has the right partner.
  // This will make sure the original b.partner has its
  // partner field nullified.
  // Note that if we don't have the special case above,
  // this will be an infinite recursion.
  b.setPartner(this);
}