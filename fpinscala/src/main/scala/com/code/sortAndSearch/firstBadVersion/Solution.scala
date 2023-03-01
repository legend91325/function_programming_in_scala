package com.code.sortAndSearch.firstBadVersion

/* The isBadVersion API is defined in the parent class VersionControl.
      def isBadVersion(version: Int): Boolean = {} */

class Solution extends VersionControl {
  def firstBadVersion(n: Int): Int = {
    firstBadVersion(1,n)
  }
  def firstBadVersion( start: Int, end: Int): Int = {
    val mid = (end-start)/2+start
    if (isBadVersion(mid)) {
      if (mid == 1) {
        return 1
      }
      if (!isBadVersion(mid - 1)) {
        return mid
      }
      firstBadVersion(start, mid - 1)
    } else {
      firstBadVersion(mid + 1, end)
    }
  }
}

