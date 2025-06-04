package io.github.libinstalld.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.Issue

class InstalldIssueRegistry : IssueRegistry() {
    override val issues: List<Issue>
        get() = emptyList()
}
