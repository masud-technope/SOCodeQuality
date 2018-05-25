boolean success = true;

if (some_condition) {
  // Handle the condition.
  success = false;
} else if (some_other_condition) {
  // Handle the other condition.
  success = false;
}
if (another_condition) {
  // Handle the third condition.
}

// Do some more critical things.

return success;